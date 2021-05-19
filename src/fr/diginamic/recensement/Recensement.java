package fr.diginamic.recensement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Recensement
{
    private List<Ville> arrayVilles;
    private List<Departement> arrayDepartements;
    private  List<Region> arrayRegions;

    public Recensement() {
        arrayVilles = new ArrayList<>();
        try (BufferedReader bufferedreader = new BufferedReader(new FileReader("C:\\Users\\darck\\IdeaProjects\\approche-objet\\src\\fr\\diginamic\\recensement.csv")))
        {
            String strCurrentLine;
            strCurrentLine = bufferedreader.readLine(); //saute 1ere ligne
            while ((strCurrentLine = bufferedreader.readLine()) != null)
            {
                String[] tokens = strCurrentLine.replace(" ", "").split(";");
                int codeRegion =  Integer.parseInt(tokens[0]);
                String nomRegion = tokens[1];
                String codeDepartement =  tokens[2];
                int codeCommune =  Integer.parseInt(tokens[5]);
                String nomCommune = tokens[6];
                int populationTotale = Integer.parseInt(tokens[9]);

                this.arrayVilles.add(new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale));
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        initArrayDepartement();
        initArrayRegion();
        System.out.println("recensement initialisé");
    }
    private void initArrayDepartement(){
        arrayDepartements = new ArrayList<>();
        List<String> allCodesDpt = getAllCodesDepartements();
        for (String code : allCodesDpt) {
            arrayDepartements.add(new Departement(code, this));
        }
    }

    private void initArrayRegion(){
        arrayRegions = new ArrayList<>();
        List<String> allNomsRegions = getAllNomsRegions();
        for (String nom : allNomsRegions) {
            arrayRegions.add(new Region(nom, this));
        }
    }

    public List<Ville> getAllVilles(){
        return this.arrayVilles;
    }

    public void displayListeVilles(List<Ville> listeVilles){
        for (Ville ville : listeVilles) {
            System.out.println(ville.toString());
        }
    }

    public Ville getVilleByName(String nomVille){
        Ville wantedVille = null;
        if(arrayVilles != null){
            for (Ville ville : this.arrayVilles) {
                if(ville.getNomCommune().equals(nomVille)){
                    wantedVille = ville;
                }
            }
        }
        else {
            System.err.println("Error : arrayVilles est null");
            return null;
        }
        return wantedVille;
    }

    public List<Ville> getVillesByCodeDepartement(String codeDpt) {
        if(arrayVilles.isEmpty()) {
            System.err.println("Error : arrayVilles est null");
            return null;
        }

        List<Ville> villesDpt = new ArrayList<>();
        for (Ville ville : this.arrayVilles) {
            if(ville.getCodeDepartement().equals(codeDpt))
                villesDpt.add(ville);
        }
        return villesDpt;
    }

    public List<Ville> getVillesByNomRegion(String nomRegion){
        if(arrayVilles.isEmpty()){
            System.err.println("Error la liste des villes est vide !");
            return null;
        }

        List<Ville> villesRegion = new ArrayList<>();
        for (Ville ville : arrayVilles) {
            if(ville.getNomRegion().equals(nomRegion))
                villesRegion.add(ville);
        }
        return villesRegion;
    }

    public int getTotalPopulation(List<Ville> listeVilles){
        if (listeVilles == null){
            System.err.println("Error : liste de ville nulle");
            return 0;
        }
        else {
            int populationTotale = 0;
            for (Ville ville : listeVilles) {
                populationTotale += ville.getPopulationTotale();
            }
            return populationTotale;
        }
    }

    public Ville getPlusPetite(List<Ville> listeVilles){
        if(listeVilles == null){
            System.err.println("Error : liste de ville nulle");
            return null;
        }
        Ville plusPetiteVille = null;
        for (Ville ville : listeVilles) {
            if(plusPetiteVille == null){
                plusPetiteVille = ville;
            }
            else {
                if(ville.getPopulationTotale() < plusPetiteVille.getPopulationTotale()){
                    plusPetiteVille = ville;
                }
            }
        }
        return plusPetiteVille;
    }

    public Ville getPlusGrande(List<Ville> listeVilles){
        if(listeVilles == null){
            System.err.println("Error : liste de ville nulle");
            return null;
        }
        Ville plusGrandeVille = null;
        for (Ville ville : listeVilles) {
            if(plusGrandeVille == null){
                plusGrandeVille = ville;
            }
            else {
                if(ville.getPopulationTotale() > plusGrandeVille.getPopulationTotale()){
                    plusGrandeVille = ville;
                }
            }
        }
        return plusGrandeVille;
    }

    public List<Ville> getBiggestVilles(List<Ville> listeVilles){
        List<Ville> biggestVilles = listeVilles;

        //On trie la liste dans l'odre décroissant de population
        biggestVilles.sort(new ComparatorPopulation().reversed());

        //On garde seulement les 10 premières villes
        biggestVilles = biggestVilles.subList(0, 10);

        return biggestVilles;
    }

    public List<Ville> getSmallestVilles(List<Ville> listeVilles){
        List<Ville> smallestVilles = listeVilles;

        //On trie la liste dans l'odre croissant de population
        smallestVilles.sort(new ComparatorPopulation());

        //On garde seulement les 10 premières villes
        smallestVilles = smallestVilles.subList(0, 10);

        return smallestVilles;
    }

    public List<String> getAllCodesDepartements(){
        List<String> arrayCodesDpt = new ArrayList<>();
        for (Ville ville : arrayVilles) {
            if(!arrayCodesDpt.contains(ville.getCodeDepartement())){
                arrayCodesDpt.add(ville.getCodeDepartement());
            }
        }
        return arrayCodesDpt;
    }

    public List<String> getAllNomsRegions(){
        List<String> arrayNomsRegions = new ArrayList<>();
        for (Departement departement : arrayDepartements) {
            if(!arrayNomsRegions.contains(departement.getNomRegion())){
                arrayNomsRegions.add(departement.getNomRegion());
            }
        }
        return arrayNomsRegions;
    }

    public List<Departement> getDepartementsByRegion(String nomRegion){
        List<Departement> departementsRegion = new ArrayList<>();
        for (Departement departement : arrayDepartements) {
            if(departement.getNomRegion().equals(nomRegion))
                departementsRegion.add(departement);
        }
        return departementsRegion;
    }

    public Departement getDepartementByCode(String code){
        Departement dpt = null;
        for (Departement departement : arrayDepartements) {
            if (departement.getCodeDepartement().equals(code)){
                dpt = departement;
                break;
            }
        }
        return dpt;
    }
    public Region getRegionByName(String nomRegion){
        Region regionToReturn = null;
        for (Region region : arrayRegions) {
            if (region.getNomRegion().equals(nomRegion))
                regionToReturn = region;
        }
        return regionToReturn;
    }

    public List<Ville> getArrayVilles() {
        return arrayVilles;
    }

    public List<Departement> getArrayDepartements() {
        return arrayDepartements;
    }

    public List<Region> getArrayRegions() {
        return arrayRegions;
    }
}
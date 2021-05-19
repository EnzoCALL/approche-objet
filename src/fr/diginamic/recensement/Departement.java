package fr.diginamic.recensement;

import java.util.List;

public class Departement {
    private String codeDepartement;
    private String nomRegion;
    private List<Ville> villesDpt;
    private int populationDpt;


    public Departement(String codeDepartement, Recensement recensement) {
        this.codeDepartement = codeDepartement;
        villesDpt = recensement.getVillesByCodeDepartement(this.codeDepartement);
        nomRegion = villesDpt.get(0).getNomRegion();

        //Init populationDpt
        this.populationDpt = 0;
        for (Ville ville : villesDpt) {
            populationDpt += ville.getPopulationTotale();
        }
    }

    public int getPopulationDpt() {
        return populationDpt;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public List<Ville> getVillesDpt() {
        return villesDpt;
    }

    public void setVillesDpt(List<Ville> villesDpt) {
        this.villesDpt = villesDpt;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    @Override
    public String toString() {
        return "{" +
                "code departement='" + codeDepartement + '\'' +
                ", region='" + nomRegion + '\'' +
                ", population=" + populationDpt +
                '}';
    }
}
package fr.diginamic.recensement.service;

import fr.diginamic.recensement.ComparatorPopulation;
import fr.diginamic.recensement.Departement;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.List;
import java.util.Scanner;

public class AfficheVillesPlusPeupleesDep extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String codeDpt;
        boolean isCodeValid = false;

        while (isCodeValid == false){
            System.out.println("Entrez un code de département : ");
            codeDpt = scanner.next();

            Departement departement = recensement.getDepartementByCode(codeDpt);
            if(departement == null) {
                System.err.println("Erreur : code région invalide");
            }
            else {
                isCodeValid = true;
                List<Ville> biggerVillesDpt = recensement.getBiggestVilles(departement.getVillesDpt());

                System.out.println("Les 10 villes les plus peuplées du département " + codeDpt + " sont : ");
                for (Ville ville : biggerVillesDpt) {
                    System.out.println(ville.toString());
                }
                System.out.println();

            }
        }
    }
}
package fr.diginamic.recensement.service;

import fr.diginamic.recensement.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AfficheVillesPlusPeupleesReg extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String nomRegion;
        boolean isNomValid = false;

        while (isNomValid==false){
            System.out.println("Entrez un nom de région : ");
            nomRegion = scanner.next();

            Region region = recensement.getRegionByName(nomRegion);
            if(region == null)
                System.err.println("Erreur : nom de région invalide");
            else {
                isNomValid = true;
                List<Ville> villesRegion = new ArrayList<>();
                //On récupère les villes de chaque departement de la région
                for (Departement departement : region.getDepartementsRegion()) {
                    villesRegion.addAll(departement.getVillesDpt());
                }

                //On récupère les 10 villes les plus peuplées
                villesRegion = recensement.getBiggestVilles(villesRegion);

                //On les affiche
                System.out.println("Les 10 villes les plus peuplées de la région " + nomRegion + " sont : ");
                for (Ville ville : villesRegion) {
                    System.out.println(ville.toString());
                }
                System.out.println();
            }
        }

    }
}
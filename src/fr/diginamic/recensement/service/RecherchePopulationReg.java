package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;

import java.util.Scanner;

public class RecherchePopulationReg extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String nomRegion;
        boolean isValid = false;

        while (isValid == false){
            System.out.println("Entrez le nom de la région dont vous souhaitez avoir la population ?");
            nomRegion = scanner.next();

            Region region = recensement.getRegionByName(nomRegion);
            if(region == null)
                System.err.println("Erreur : nom de région invalide");
            else    {
                isValid = true;
                System.out.println("La région " + nomRegion + " a une population totale de " + region.getPopulationRegion() + " habitants");
                System.out.println();
            }

        }

    }
}
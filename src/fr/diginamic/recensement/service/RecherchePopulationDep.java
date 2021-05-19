package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Departement;
import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public class RecherchePopulationDep extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String codeDpt;
        boolean isCodeValid = false;

        while (isCodeValid == false){
            System.out.println("Entrez le code du département dont vous souhaitez avoir la population ?");
            codeDpt = scanner.next();

            Departement departement = recensement.getDepartementByCode(codeDpt);
            if(departement == null)
                System.err.println("Erreur : code département invalide");
            else {
                isCodeValid = true;
                System.out.println("Le département " + codeDpt + " a une population totale de " + departement.getPopulationDpt() + " habitants");
                System.out.println();
            }

        }
    }
}
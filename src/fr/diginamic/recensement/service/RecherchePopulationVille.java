package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;
import fr.diginamic.recensement.service.MenuService;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        String nomVille;
        boolean isNomValid = false;

        while (isNomValid == false){
            System.out.println("De quelle ville souhaitez-vous avoir la population ?");
            nomVille = scanner.next();

            Ville ville = recensement.getVilleByName(nomVille);

            if(ville == null)
                System.err.println("Erreur : nom de ville invalide");
            else {
                isNomValid = true;
                System.out.println(nomVille + " a une population de " + ville.getPopulationTotale() + " habitants");
                System.out.println();
            }

        }

    }
}
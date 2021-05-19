package fr.diginamic.recensement;

import fr.diginamic.recensement.service.*;

import java.util.Scanner;

public class Application {

    public static void main(String[] args)
    {
        Recensement recensement = new Recensement();
        Scanner scan = new Scanner(System.in);

        boolean quitter = false;

        while (quitter == false)
        {
            System.out.println("*** Application Recensement France ***");
            System.out.println("MENU \n" +
                    " 1. Population d’une ville donnée \n" +
                    " 2. Population d’un département donné \n" +
                    " 3. Population d’une région donnée \n" +
                    " 4. Afficher les 10 régions les plus peuplées \n" +
                    " 5. Afficher les 10 départements les plus peuplés \n" +
                    " 6. Afficher les 10 villes les plus peuplées d’un département \n" +
                    " 7. Afficher les 10 villes les plus peuplées d’une région \n" +
                    " 8. Afficher les 10 villes les plus peuplées de France \n" +
                    " 9. Quitter l'application \n");
            System.out.print("Votre choix : ");
            int choixMenu = scan.nextInt();

            switch(choixMenu) {
                case 1:
                    RecherchePopulationVille recherche = new RecherchePopulationVille();
                    recherche.traiter(recensement, scan);
                    break;
                case 2:
                    RecherchePopulationDep recherchePopulationDep = new RecherchePopulationDep();
                    recherchePopulationDep.traiter(recensement, scan);
                    break;
                case 3:
                    RecherchePopulationReg recherchePopulationReg = new RecherchePopulationReg();
                    recherchePopulationReg.traiter(recensement, scan);
                    break;
                case 4:
                    AfficheRegPlusPeuplees afficheRegPlusPeuplees = new AfficheRegPlusPeuplees();
                    afficheRegPlusPeuplees.traiter(recensement, scan);
                    break;
                case 5:
                    AfficheDepPlusPeuples afficheDepPlusPeuples = new AfficheDepPlusPeuples();
                    afficheDepPlusPeuples.traiter(recensement, scan);
                    break;
                case 6:
                    AfficheVillesPlusPeupleesDep afficheVillesPlusPeupleesDep = new AfficheVillesPlusPeupleesDep();
                    afficheVillesPlusPeupleesDep.traiter(recensement, scan);
                    break;
                case 7:
                    AfficheVillesPlusPeupleesReg afficheVillesPlusPeupleesReg = new AfficheVillesPlusPeupleesReg();
                    afficheVillesPlusPeupleesReg.traiter(recensement, scan);
                    break;
                case 8:
                    AfficheVillesPlusPeupleesFrance affichageVillesPlusPeupleesFrance = new AfficheVillesPlusPeupleesFrance();
                    affichageVillesPlusPeupleesFrance.traiter(recensement, scan);
                    break;
                case 9:
                    quitter = true;
                    System.out.println("Arrêt de l'application.");
                    break;
                default:
                    System.out.println("Selection invalide");
            }
        }
    }


}
package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.List;
import java.util.Scanner;

public class AfficheVillesPlusPeupleesFrance extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Ville> biggesttVillesFrance = recensement.getBiggestVilles(recensement.getAllVilles());

        System.out.println("Les 10 villes les plus peuplées de France sont : ");
        for (Ville ville : biggesttVillesFrance) {
            System.out.println(ville.toString());
        }
        System.out.println();
    }
}
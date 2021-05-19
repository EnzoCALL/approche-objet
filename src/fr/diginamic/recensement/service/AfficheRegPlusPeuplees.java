package fr.diginamic.recensement.service;

import fr.diginamic.recensement.ComparatorPopReg;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;

import java.util.List;
import java.util.Scanner;

public class AfficheRegPlusPeuplees extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Region> regionsPlusPeuplees = recensement.getArrayRegions();
        regionsPlusPeuplees.sort(new ComparatorPopReg().reversed());
        regionsPlusPeuplees = regionsPlusPeuplees.subList(0, 10);

        System.out.println("Les 10 régions les plus peuplées sont : ");
        for (Region region : regionsPlusPeuplees) {
            System.out.println(region.toString());
        }
        System.out.println();
    }
}
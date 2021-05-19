package fr.diginamic.recensement.service;

import fr.diginamic.recensement.ComparatorPopDep;
import fr.diginamic.recensement.Departement;
import fr.diginamic.recensement.Recensement;

import java.util.List;
import java.util.Scanner;

public class AfficheDepPlusPeuples extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Departement> departementsPlusPeuples = recensement.getArrayDepartements();
        departementsPlusPeuples.sort(new ComparatorPopDep().reversed());
        departementsPlusPeuples = departementsPlusPeuples.subList(0, 10);

        System.out.println("Les 10 départements les plus peuplées sont : ");
        for (Departement departement : departementsPlusPeuples) {
            System.out.println(departement.toString());
        }
        System.out.println();
    }
}
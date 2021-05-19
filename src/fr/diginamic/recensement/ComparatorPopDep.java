package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorPopDep implements Comparator<Departement> {
    @Override
    public int compare(Departement d1, Departement d2) {
        if(d1.getPopulationDpt() < d2.getPopulationDpt())
            return -1;
        else if(d1.getPopulationDpt() > d2.getPopulationDpt())
            return 1;
        else
            return 0;
    }
}
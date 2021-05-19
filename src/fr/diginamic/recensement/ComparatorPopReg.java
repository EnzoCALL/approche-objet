package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorPopReg implements Comparator<Region> {
    @Override
    public int compare(Region r1, Region r2) {
        if(r1.getPopulationRegion() < r2.getPopulationRegion())
            return -1;
        else if (r1.getPopulationRegion() > r2.getPopulationRegion())
            return 1;
        else
            return 0;
    }
}
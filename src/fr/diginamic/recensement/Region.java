package fr.diginamic.recensement;

import java.util.List;

public class Region {
    String nomRegion;
    int codeRegion;
    List<Departement> departementsRegion;
    int populationRegion;

    public Region(String nomRegion, Recensement recensement) {
        this.nomRegion = nomRegion;
        this.departementsRegion = recensement.getDepartementsByRegion(nomRegion);
        this.codeRegion = this.departementsRegion.get(0).getVillesDpt().get(0).getCodeRegion();

        this.populationRegion = 0;
        for (Departement departement : departementsRegion) {
            this.populationRegion += departement.getPopulationDpt();
        }
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getCodeRegion() {
        return codeRegion;
    }

    public List<Departement> getDepartementsRegion() {
        return departementsRegion;
    }

    public int getPopulationRegion() {
        return populationRegion;
    }

    @Override
    public String toString() {
        return "{" +
                "nomRegion='" + nomRegion + '\'' +
                ", codeRegion=" + codeRegion +
                ", populationRegion=" + populationRegion +
                '}';
    }
}
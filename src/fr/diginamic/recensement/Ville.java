package fr.diginamic.recensement;

public class Ville {
    int codeRegion;
    String nomRegion;
    String codeDepartement; //certain département comme la Corse ont des lettres (2A, 2B)
    int codeCommune;
    String nomCommune;
    int populationTotale;

    public Ville(int codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        String str = "Ville{" +
                "Commune : '" + nomCommune + '\'' +
                ", Code commune : " + codeCommune +
                ", Code region : " + codeRegion +
                ", Code département : " + codeDepartement +
                ", Région : " + nomRegion +
                ", populationTotale=" + populationTotale +
                "}";
        return str;
    }

    public boolean isBiggerThan(Ville v){
        return this.populationTotale > v.getPopulationTotale();
    }

    public boolean isSmallerThan(Ville v){
        return this.populationTotale < v.getPopulationTotale();
    }

    /* GETTERS & SETTERS */

    public int getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public int getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(int codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }
}
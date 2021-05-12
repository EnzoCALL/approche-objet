package tri;

public class Pays {

    private String nom, continent;
    private int nombreHabitants;

    public Pays(String nom, String continent, int nombreHabitants) {
        this.nom = nom;
        this.continent = continent;
        this.nombreHabitants = nombreHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(int nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", continent='" + continent + '\'' +
                ", nombreHabitants=" + nombreHabitants +
                '}';
    }

}
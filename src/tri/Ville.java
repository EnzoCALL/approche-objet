package tri;

public class Ville implements Comparable<Ville> {

    private String nom;
    private int nombreHabitants;

    public Ville(String nom, int nombreHabitants) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(int nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nombreHabitants=" + nombreHabitants +
                '}';
    }

    @Override
    public int compareTo(Ville other) {
        //return this.nom.compareTo(other.nom);
        return this.nombreHabitants - other.nombreHabitants;
    }

}
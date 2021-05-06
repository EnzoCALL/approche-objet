package interfaces;

public class Rectangle implements ObjetGeometrique {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    @Override
    public double perimetre() {
        return 0;
    }

    @Override
    public double surface() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "longueur= " + longueur +
                ", largeur= " + largeur;
    }
}

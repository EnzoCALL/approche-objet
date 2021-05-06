package interfaces;

public class Cercle implements ObjetGeometrique {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
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
        return "Cercle: " +
                "rayon= " + rayon;
    }
}

package fr.diginamic.entites;
import java.lang.Math.*;
public class Cercle {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double opPerimetre()

    {
        double perimetre = (this.rayon * 2) * Math.PI;
        return perimetre;
    }

    public double opSurface()

    {
        double surface = (this.rayon * this.rayon) * Math.PI;
        return surface;
    }

}

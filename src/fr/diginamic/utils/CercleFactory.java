package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

    //private static int ct = 1;

    public static Cercle CercleFactory(double creaCercle){

        Cercle cercle = new Cercle(creaCercle);
        return cercle;
    }
}

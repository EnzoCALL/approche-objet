package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

;

public class TestCercle {

    public static void main(String[] args) {

        Cercle cercle1 = new Cercle(12.00);
        Cercle cercle2 = new Cercle (54.50);

        CercleFactory.CercleFactory(23.33);

        System.out.println("Le perimetre du premier cercle est: " + cercle1.opPerimetre() + ". Sa surface est: " + cercle1.opSurface());
        System.out.println("Le perimetre du premier cercle est: " + cercle2.opPerimetre() + ". Sa surface est: " + cercle2.opSurface());

        System.out.println(CercleFactory.CercleFactory(43.34));

    }
}

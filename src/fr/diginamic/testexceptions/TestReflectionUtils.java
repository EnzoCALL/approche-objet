package fr.diginamic.testexceptions;

import fr.diginamic.sets.Pays;

import javax.management.ReflectionException;

public class TestReflectionUtils {

    public static void main(String[] args) {

        Pays inst = new Pays("Alouette", 32, 180000);

        try {
            ReflectionUtils.afficherAttributs(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (fr.diginamic.testexceptions.ReflectionException e) {
            e.printStackTrace();
        }

    }
}

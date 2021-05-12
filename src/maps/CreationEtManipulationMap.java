package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {
    public static void main(String args[]) {
        Map<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        System.out.println("\nLes noms des departements dans la map: ");
        for (String test : mapVilles.values())
        {
            System.out.print(test + ", ");
        }
        System.out.println("\n\nLes numéros des departements dans la map: ");
        for (Integer test : mapVilles.keySet())
        {
            System.out.print(test + ", ");
        }

        System.out.println("\n\nLa taille de la map: " + mapVilles.size());

        //for (Map.Entry<Integer, String> test: mapVilles.entrySet())
        //    System.out.println(test.getKey()+ ", " + test.getValue());

    }
}
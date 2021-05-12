package maps;

import tri.Ville;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapVilles {

    public static void main(String[] args) {

        Map<String, Ville> mapVille = new HashMap<String , Ville>();

        mapVille.put("Nice", new Ville("Nice", 343000));
        mapVille.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVille.put("Narbonne", new Ville("Narbonne", 53400));
        mapVille.put("Lyon", new Ville("Lyon", 484000));
        mapVille.put("Foix", new Ville("Foix", 9700));
        mapVille.put("Pau", new Ville("Pau", 77200));
        mapVille.put("Marseille", new Ville("Marseille", 850700));
        mapVille.put("Tarbes", new Ville("Tarbes", 40600));

        String keyMinValue = "Nice";

        System.out.println("\nListe originale des villes: \n");
        for (Ville test : mapVille.values())
            System.out.println(test);

        for (String cle : mapVille.keySet())
        {
            if (mapVille.get(cle).getNombreHabitants() < mapVille.get(keyMinValue).getNombreHabitants())
            {
                keyMinValue = cle;
            }
        }

        System.out.println("\nOn enleve la ville la moins peuplée. Il s'agit de " + keyMinValue +". \n");
        mapVille.remove(keyMinValue);

        for (Ville test : mapVille.values())
            System.out.println(test);

    }
}

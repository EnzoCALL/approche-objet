package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

    public static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        // On recupère la ville qui a le plus de lettres
        String villePlusDeLettres = villes.get(0);
        for (String ville : villes) {
            if (ville.length() > villePlusDeLettres.length())
                villePlusDeLettres = ville;
        }
        System.out.println("Ville qui a le plus de lettres : " + villePlusDeLettres);

        // On met toutes les villes en majuscule
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }

        // On supprime les villes qui comment par la lettre N
        Iterator<String> iterator = villes.iterator();
        while (iterator.hasNext()){
            if (iterator.next().charAt(0) == 'N')
                iterator.remove();
        }

        for (String ville : villes) {
            System.out.println(ville);
        }

    }

}
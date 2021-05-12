package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {

    public static void main(String args[])
    {

        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> listeUlti = new ArrayList<String>();

        Iterator<String> it = liste1.iterator();
        Iterator<String> it2 = liste2.iterator();
        Iterator<String> itU = listeUlti.iterator();

        while (it.hasNext())
        {
            listeUlti.add(String.valueOf(it.next()));
        }

        while (it2.hasNext())
        {
            listeUlti.add(String.valueOf(it2.next()));
        }

        for (String s : listeUlti)
        {
            System.out.println(s);
        }
    }
}
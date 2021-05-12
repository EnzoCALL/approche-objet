package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

    public static void main(String[] args) {

        List<Integer> liste1 = new ArrayList<>();
        for (int i=0; i < 100; i++)
        {
            liste1.add(i);
        }
        System.out.println(liste1.size());

    }
}

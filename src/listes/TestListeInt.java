package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(0, -1);
        list1.add(1, 5);
        list1.add(2, 7);
        list1.add(3, 3);
        list1.add(4, -2);
        list1.add(5, 4);
        list1.add(6, 8);
        list1.add(7, 5);

        Iterator<Integer> it = list1.iterator();

        for (Integer integer : list1) {
            System.out.print(integer + ", ");
        }
        System.out.println("\nLa taille de la liste: "  + list1.size());

        int grand = -999;
        int petit = 999;
        Integer indexpetit = 0;

        for (Integer integer : list1) {
            if (integer > grand)
            {
                grand = integer;
            }
        }

        System.out.println("La plus grande valeur stocké est: " + grand);

        for (Integer integer : list1) {
            if (integer < petit)
            {
                petit = integer;
                indexpetit = list1.indexOf(integer);
            }
        }

        list1.remove(indexpetit);
        System.out.println("La plus petite valeur stockée a été enlevé. Sa valeur était: " + petit);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < 0)
            {
                list1.set(i,list1.get(i)-list1.get(i)-list1.get(i) );

            }
        }
        System.out.println("Les valeurs négatives ont été converti en valeurs positives.");

        for (Integer integer : list1) {
            System.out.print(integer + ", ");
        }

    }
}

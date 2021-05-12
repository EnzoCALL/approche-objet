package maps;

import tri.Pays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {

    public static void main(String[] args) {

        ArrayList<Pays> paysArrayList = new ArrayList<>();
        paysArrayList.add(new Pays("France","Europe",65));
        paysArrayList.add(new Pays("Allemagne","Europe",80));
        paysArrayList.add(new Pays("Belgique","Europe",10));
        paysArrayList.add(new Pays("Russie","Asie",150));
        paysArrayList.add(new Pays("Chine","Asie",1400000000));
        paysArrayList.add(new Pays("Indonesie","Oceanie",220));
        paysArrayList.add(new Pays("Australie","Oceanie",20));

        HashMap<String, Integer> paysParContinentMap = new HashMap<>();
        for (Pays pays : paysArrayList) {
            if (paysParContinentMap.containsKey(pays.getContinent()))
                paysParContinentMap.put(pays.getContinent(), paysParContinentMap.get(pays.getContinent()) + 1);
            else{
                paysParContinentMap.put(pays.getContinent(), 1);
            }
        }

        // methode plus concise :
        // for (Pays pays : paysArrayList) {
        //    paysParContinentMap.merge(pays.getContinent(), 1, Integer::sum);
        // }

        for (Map.Entry<String, Integer> stringIntegerEntry : paysParContinentMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }

    }

}
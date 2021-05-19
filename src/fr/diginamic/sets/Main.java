package fr.diginamic.sets;

public class Main {

    public static void main(String[] args) {

        Pays pays1 = new Pays("pays1", 5000, 3000);
        Pays pays2 = new Pays("pays1", 5000, 3000);


        //boolean result = pays1 == pays2;

        System.out.println(pays1.hashCode());
        System.out.println(pays2.hashCode());


    }

}
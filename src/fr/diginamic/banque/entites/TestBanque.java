package fr.diginamic.banque.entites;

import entites.Personne;

public class TestBanque {

    public static void main(String[] args) {

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte (2000);
        comptes[1] = new CompteTaux (10000, 1.6);

        for (Compte argu : comptes) {
            System.out.println(argu.toString());
        }


        //Compte randomCompte1 = new Compte(500000);
        //Compte randomCompte2 = new Compte(4500000);
        //Compte randomCompte3 = new Compte(3000);
        //System.out.println(randomCompte1 + "\n" + randomCompte2 + "\n" + randomCompte3);

        //CompteTaux randCompte1 = new CompteTaux(5394,1.2);
        //System.out.println(randCompte1);

    }
}

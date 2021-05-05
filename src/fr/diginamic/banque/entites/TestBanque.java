package fr.diginamic.banque.entites;

import entites.Personne;

public class TestBanque {

    public static void main(String[] args) {

        Compte randomCompte1 = new Compte(500000);
        Compte randomCompte2 = new Compte(4500000);
        Compte randomCompte3 = new Compte(3000);
        System.out.println(randomCompte1 + "\n" + randomCompte2 + "\n" + randomCompte3);

    }
}

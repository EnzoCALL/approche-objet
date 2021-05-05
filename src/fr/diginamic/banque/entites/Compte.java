package fr.diginamic.banque.entites;

public class Compte{

    private static int ct = 1;
    private int nomCompte;
    private double soldeCompte;


    public Compte(double soldeCompte) {

        this.nomCompte = ct++;
        this.soldeCompte = soldeCompte;
    }

    public int getNomCompte() {
        return nomCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setNomCompte(int nomCompte) {
        this.nomCompte = nomCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "nomCompte=" + nomCompte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }
}

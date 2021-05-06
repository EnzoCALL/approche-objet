package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    private double taux;

    public CompteTaux(double soldeCompte, double taux) {
        //Nom du compte auto incrémenté
        super(soldeCompte);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + " Taux du compte= " + taux;
    }
}


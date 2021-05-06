package fr.diginamic.banque.entites;

public abstract class Operation {


    protected String dateOP;
    protected double montantOP;
    private double x = 0;

    public double getX() {
        return x;
    }

    public Operation(String dateOP, double montantOP) {
        this.dateOP = dateOP;
        this.montantOP = montantOP;
    }

    @Override
    public String toString() {
        return ("Date de l'operation: " + dateOP + "\n" + "Montant de l'operation: " + montantOP + "\n" + "Type de l'operation: " + getType() + "\n"
                +"Solde restant: ");
    }

    abstract String getType();

    public double mAJ(){

        String j = getType();
        if (j.equals("DEBIT"))
            x = x - montantOP;
        else
            x = x + montantOP;
        return (double) x;
    }
}


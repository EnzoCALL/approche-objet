package fr.diginamic.banque.entites;

public class Debit extends Operation {


    public Debit(String dateOP, double montantOP) {
        super(dateOP, montantOP);
    }

    @Override
    String getType() {
        return "DEBIT";
    }


}

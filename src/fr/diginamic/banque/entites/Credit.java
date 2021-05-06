package fr.diginamic.banque.entites;

public class Credit extends Operation {


    public Credit(String dateOP, double montantOP) {
        super(dateOP, montantOP);
    }

    @Override
    String getType() {
        return "CREDIT";
    }


}

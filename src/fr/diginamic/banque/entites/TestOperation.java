package fr.diginamic.banque.entites;

public class TestOperation {

    public static void main(String[] args) {
        double Y = 0;
        Operation[] ops= new Operation[4];
        ops[0] = new Credit("12/04/21", 12.50);
        ops[1] = new Debit("13/04/21", 5.00);
        ops[2] = new Debit("16/04/21", 2.25);
        ops[3] = new Credit("17/04/21", 50.00);

        for (Operation oops : ops) {
            System.out.print(oops);
            oops.mAJ();
            Y = Y + oops.getX();
            System.out.println(Y + "\n");
        }
    }
}

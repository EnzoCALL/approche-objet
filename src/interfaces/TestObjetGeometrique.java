package interfaces;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique[] stocks = new ObjetGeometrique[2];
        stocks[0] = new Cercle (3.75);
        stocks[1] = new Rectangle(12.15,5.00);

        //System.out.println(((Cercle)stocks[0]).getRayon());

        for (ObjetGeometrique calc : stocks){
            System.out.println(calc);
        }
    }
}

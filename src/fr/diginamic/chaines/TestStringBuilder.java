package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        String stringue = new String();

        long debut = System.currentTimeMillis();

        for (int i=0; i < 100001; i++)
        {
            builder.append(i);
        }

        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes (StringBuilder):" + (fin - debut));

        long debut3 = System.currentTimeMillis();

        for (int i=0; i < 100001; i++)
        {
            buffer.append(i);
        }

        long fin3 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes (StringBuffer):" + (fin3 - debut3));

        long debut2 = System.currentTimeMillis();

        for (int u=0; u < 100001; u++)
        {
            stringue = stringue + u;
        }

        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes (String):" + (fin2 - debut2));

    }
}

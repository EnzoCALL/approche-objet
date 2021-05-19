package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Calendar calModif = Calendar.getInstance();
        Date date = cal.getTime();
        Date dateModif = calModif.getTime();
        Date dateLitt = cal.getTime();

        calModif.set(2016, Calendar.MAY, 19, 23, 59,30);

        SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        SimpleDateFormat formateurModif = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formateurLitt1 = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.FRANCE);
        SimpleDateFormat formateurLitt2 = new SimpleDateFormat("EEEEE dd MMMM yyyy", new Locale("ru"));
        SimpleDateFormat formateurLitt3 = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.CHINA);
        SimpleDateFormat formateurLitt4 = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.GERMANY);

        String dateStr = formateur.format(date);
        String dateStrModif = formateurModif.format(dateModif);
        String dateStrLitt1 = formateurLitt1.format(date);
        String dateStrLitt2 = formateurLitt2.format(date);
        String dateStrLitt3 = formateurLitt3.format(date);
        String dateStrLitt4 = formateurLitt4.format(date);

        System.out.println("\nDate actuelle: " + dateStr);
        System.out.println("Date customisée: " + dateStrModif);
        System.out.println("\nDate actuelle en francais:   " + dateStrLitt1);
        System.out.println("Date actuelle en russe:      " + dateStrLitt2);
        System.out.println("Date actuelle en chinois:    " + dateStrLitt3);
        System.out.println("Date actuelle en allemand:   " + dateStrLitt4);


    }

}

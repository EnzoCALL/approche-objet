package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {

        Date date = new Date();
        Date dateModif = new Date(116,Calendar.MAY,19,23,59,30);
        Date dateSys = new Date();

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formateurModif = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

        String dateStr = formateur.format(date);
        String dateStrModif = formateurModif.format(dateModif);
        String dateStrSys = formateurModif.format(dateSys);

        System.out.println(dateStr);
        System.out.println(dateStrModif);
        System.out.println(dateStrSys);


    }
}

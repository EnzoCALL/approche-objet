package entites;

import java.util.Locale;
import java.util.Scanner;

public class Personne {

    public String nom, prenom, adressPost;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, String adressPost) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressPost = adressPost;
    }

    public String afficher(){
        System.out.println(nom.toUpperCase(Locale.ROOT) + " " + prenom);
        return null;
    }

    public String afficherTout(){
        System.out.println(nom.toUpperCase(Locale.ROOT) + " " + prenom + " " + adressPost);
        return null;
    }

    public void modifNom(String modifier){

        Scanner scan= new Scanner(System.in);
        System.out.println("Ecrivez le nouveau nom de l'utilisateur: " + nom.toUpperCase(Locale.ROOT) + " " + prenom);
        modifier = scan.next();
        nom = modifier;
    }

    public void modifPrenom(String modifier){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ecrivez le nouveau prenom de l'utilisateur: " + nom.toUpperCase(Locale.ROOT) + " " + prenom);
        modifier = scan.next();
        prenom = modifier;
    }

    public void modifAdress(String modifier){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ecrivez la nouvelle adresse de l'utilisateur: " + nom.toUpperCase(Locale.ROOT) + " " + prenom);
        modifier = scan.next();
        adressPost = modifier;
    }

    public String returnNom(){
        return nom;
    }
    public String returnPrenom(){
        return prenom;
    }
    public String returnAdresse(){
        return adressPost;
    }

}

package essais;
import entites.Personne;

public class TestPersonne {

    public static void main(String[] args) {

            //APPEL DU CONSTRUCTEUR POUR CONSTRUIRE DEUX OBJET
            Personne moi = new Personne("Callegari", "Enzo");
            Personne lui = new Personne("Bertrand", "Bren");
            Personne lui2 = new Personne("Jean", "Jean", "17");

            String appeldemethod = moi.afficher();

            moi.modifNom(moi.nom);
            lui.modifPrenom(lui.prenom);
            lui2.modifAdress(lui2.adressPost);

            appeldemethod = moi.afficher();
            appeldemethod = lui.afficher();
            appeldemethod = lui2.afficherTout();
    }
}

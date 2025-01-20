import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {

        GestionProduit gestionProduit = new GestionProduit();


        gestionProduit.ajouterProduit(new Produit(1, "Laptop", "Ordinateur portable", 1500));
        gestionProduit.ajouterProduit(new Produit(2, "Smartphone", "Téléphone Android", 200));
        gestionProduit.ajouterProduit(new Produit(3, "Casque", "Casque audio", 100));
        gestionProduit.ajouterProduit(new Produit(4, "Imprimante", "Imprimante multifonction", 250));

        System.out.println("Liste des produits avant tri :");
        gestionProduit.afficherProduits();


        gestionProduit.trierProduitsParPrix();

        System.out.println("Liste des produits après tri par prix :");
        gestionProduit.afficherProduits();


        gestionProduit.supprimerProduitsChers();

        System.out.println("Liste des produits après suppression des produits chers :");
        gestionProduit.afficherProduits();
    }
}
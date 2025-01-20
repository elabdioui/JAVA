import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class GestionProduit {

    private LinkedList<Produit> produits;

    public GestionProduit() {

        this.produits = new LinkedList<>();
    }


    public void ajouterProduit(Produit produit) {

        produits.add(produit);
    }


    public void trierProduitsParPrix() {
        produits.sort((p1, p2) -> Double.compare(p1.getPrix(), p2.getPrix()));
    }


    public void afficherProduits() {
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }


    public void supprimerProduitsChers() {
        produits.removeIf(produit -> produit.getPrix() > 300);
    }

}

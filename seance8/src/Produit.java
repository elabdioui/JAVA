import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Produit {

    private int id;
    private String nom;
    private String description;
    private double prix;

    public Produit(int id, String nom, String description, double prix) {
        this.id = id;
        this.nom = nom;
        description = description;
        this.prix = prix;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        description = description;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}




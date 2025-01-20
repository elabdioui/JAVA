package livre;

public class Livre {
    String titre;
    String auteur;
    int anneePub;
    boolean disponible=true;

    public Livre(String titre, String auteur, int anneePub) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePub = anneePub;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public int getAnneePub() {
        return anneePub;
    }
    public void setAnneePub(int anneePub) {
        this.anneePub = anneePub;
    }
    public boolean emprunter(){
        return disponible=false;
    }
    public boolean retourner(){
        return disponible=true;
    }
    public void afficher(){
        System.out.println("Titre: " + titre +"\nauteur: " + auteur +"\nanneePub: " + anneePub  +"\ndisponible: " + disponible);
    }
}

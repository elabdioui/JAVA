package cntrl;

public class Livre {

    private String titre;
    private String auteur;
    private double prix;

    public Livre(String titre, String auteur, double prix) throws PrixInvalidException{
        if(prix < 0) throw new PrixInvalidException();
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
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
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) throws PrixInvalidException{
        if(prix < 0) throw new PrixInvalidException();
        this.prix = prix;
    }

    @Override
    public String toString() {
        return ("le titre: " + this.getTitre() + ", auteur: " + this.getAuteur() + ", prix: " + this.getPrix());
    }
}

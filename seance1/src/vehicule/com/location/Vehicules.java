package vehicule.com.location;

 abstract public class Vehicules {
    private String marque;
    private String modele;
    private Double prixParJour;

    public Vehicules(String marque, String modele, Double prixParJour) {
        this.marque = marque;
        this.modele = modele;
        this.prixParJour = prixParJour;
    }

    public String getMarque() {return marque;}
    public String getModele() {return modele;}
    public Double getPrixParJour() {return prixParJour;}
    public void setMarque(String marque) {this.marque = marque;}
    public void setModele(String modele) {this.modele = modele;}
    public void setPrixParJour(Double prixParJour) {this.prixParJour = prixParJour;}

    public Double prix(int duree){
        return prixParJour*duree;
    }
    abstract public void afficher();
}



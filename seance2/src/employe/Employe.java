package employe;

abstract public class Employe {
    private String nom;
    private String prenom;
    private double salaireBase;

    public Employe(String nom, String prenom, double salaireBase) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaireBase = salaireBase;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public double getSalaireBase() {
        return salaireBase;
    }
    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }
    abstract public double calculerSalaire();
}

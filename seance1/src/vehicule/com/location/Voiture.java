package vehicule.com.location;

public class Voiture extends Vehicules{
    private int nombreDePortes;
    public Voiture(String marque, String modele, Double prixParJour, int nombreDePortes){
        super(marque, modele, prixParJour);
        this.nombreDePortes = nombreDePortes;
    }
    public int getNombreDePortes() {return nombreDePortes;}
    public void setNombreDePortes(int nombreDePortes) {this.nombreDePortes = nombreDePortes;}
    @Override public void afficher() {
        System.out.println("marque: " + super.getMarque() + "\nmodele: " +  super.getModele() + "\nprix: " + super.getPrixParJour());
        System.out.println("Nombre de portes: " + nombreDePortes);
    }
}

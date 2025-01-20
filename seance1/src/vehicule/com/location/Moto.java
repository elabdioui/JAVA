package vehicule.com.location;

public class Moto extends Vehicules {
    private int cylinder;

    public Moto(String marque, String modele, double prixParJour, int cylinder) {
        super(marque, modele, prixParJour);
        this.cylinder = cylinder;
    }

    @Override
    public void afficher() {
        System.out.println("marque: " + super.getMarque() + "\nmodele: " +  super.getModele() + "\nprix: " + super.getPrixParJour());
        System.out.println("cylinder: " + cylinder);
    }
}
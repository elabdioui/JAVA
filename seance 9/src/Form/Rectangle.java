package Form;

public class Rectangle extends Form {
    private double largeur;
    private double longeur;

    public Rectangle(double largeur, double longeur) {
        this.largeur = largeur;
        this.longeur = longeur;
    }
    public double getLargeur() {
        return largeur;
    }
    public double getLongeur() {
        return longeur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    @Override
    public double calculAir() {
        double s;
        s=longeur*largeur;
        return s;
    }
}

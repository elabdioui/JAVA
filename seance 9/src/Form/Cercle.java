package Form;

public class Cercle extends Form {

    private double rayon;

    public Cercle(Double rayon) {
        this.rayon = rayon;
    }
    public Double getRayon() {
        return rayon;
    }
    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }
    @Override
    public double calculAir() {
        double s;
        s=Math.PI*Math.pow(rayon,2);
        return s;
    }


}

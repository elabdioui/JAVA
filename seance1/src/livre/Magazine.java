package livre;

public class Magazine extends Livre {
    private int numero;
    private int moisPub;

    public Magazine(String titre, String auteur, int anneePub,int numero, int moisPub) {
        super(titre, auteur, anneePub);
        this.numero = numero;
        this.moisPub = moisPub;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getMoisPub() {
        return moisPub;
    }
    public void setMoisPub(int moisPub) {
        this.moisPub = moisPub;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Numero: " + numero + ", MoisPub: " + moisPub);
    }
}

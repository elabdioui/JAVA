package livre;

public class GestionBibliotheque {
    public static void main(String[] args) {
        LivreRoman LR=new LivreRoman("abc","victor",1950,"policier");
        Magazine M= new Magazine("majid","hugo",2016,15,6);
        LR.afficher();
        LR.emprunter();
        LR.afficher();
        LR.retourner();
        LR.afficher();
        M.afficher();

    }
}
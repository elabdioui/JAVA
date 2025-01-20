import employe.*;


public class Main {
    public static void main(String[] args) {

        Gestion g=new Gestion();
        Employe e1=new EmployeTempsPlein("n1","p1",3000) ;
        Employe e2=new EmployeTempsPartiel("n2","p2",3000) ;
        Employe e3=new Stagiaire("n3","p3",5000) ;
        Employe e4=new Freelance("n4","p4",3000) ;
        g.ajouterEmploye(e1);
        g.ajouterEmploye(e2);
        g.ajouterEmploye(e3);
        g.ajouterEmploye(e4);

        g.afficheSalaires();

    }
}
package employe;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gestion {

    private ArrayList<Employe> employes ;


    public Gestion() {
        this.employes = new ArrayList();
    }

    public void ajouterEmploye(Employe e) {
       employes.add(e);
    }

    public void afficheSalaires() {
        for (Employe x:employes) {
            Employe e = x;
            System.out.println( "Salaire : "+e.calculerSalaire() );
        }
    }
}

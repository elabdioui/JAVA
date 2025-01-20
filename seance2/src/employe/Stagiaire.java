package employe;

public class Stagiaire extends Employe{
    public Stagiaire(String nom,String prenom,double salaireBase) {

        super(nom,prenom,salaireBase);
    }

    @Override public double calculerSalaire() {

        this.setSalaireBase(2000);
        return this.getSalaireBase();

    }
}

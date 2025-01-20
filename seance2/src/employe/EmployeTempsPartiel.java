package employe;

public class EmployeTempsPartiel extends Employe{


    public EmployeTempsPartiel(String nom,String prenom,double salaireBase) {
        super(nom,prenom,salaireBase);
    }
    @Override public double calculerSalaire() {
        return this.getSalaireBase()/2;
    }
}

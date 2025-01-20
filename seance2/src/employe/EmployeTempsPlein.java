package employe;

public class EmployeTempsPlein extends Employe{
    public EmployeTempsPlein(String nom,String prenom,double salaireBase) {
        super(nom,prenom,salaireBase);
    }

    @Override public double calculerSalaire() {
        return this.getSalaireBase();
    }
}

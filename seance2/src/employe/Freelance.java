package employe;

public class Freelance extends Employe{

    public Freelance(String nom,String prenom,double salaireParJour) {
        super(nom,prenom,salaireParJour*20);
    }

    @Override public  double calculerSalaire(){
        return getSalaireBase()*20;
    }

}

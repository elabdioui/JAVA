package banque;

public class CompteEpargne extends Compte {

    private double fraisGestion;

    public CompteEpargne(int identifiantCompte, double soldeInitial,double fraisGestion) {
        super(identifiantCompte, soldeInitial);
        this.fraisGestion = fraisGestion;
    }

    @Override public void ajoutFrais(double fraisGestion) throws SoldeNegatifException{
        this.setSoldeInitial(this.getSoldeInitial() + this.fraisGestion);
    }
}
package banque;

public class CompteCourant extends Compte {
    private double montantDeouverAutorise;

    public CompteCourant(int identifiantCompte, double soldeInitial,double montantDeouverAutorise)  {
        super(identifiantCompte, soldeInitial);
        this.montantDeouverAutorise = montantDeouverAutorise;
    }

    @Override public void ajoutFrais(double montantDeouverAutorise) throws SoldeNegatifException  {
        this.setSoldeInitial(this.getSoldeInitial()+ this.montantDeouverAutorise);
    }



}


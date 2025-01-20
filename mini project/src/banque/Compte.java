package banque;

abstract class Compte implements CompteBancaire {
    private int identifiantCompte;
    private double soldeInitial;

    public Compte(int identifiantCompte, double soldeInitial)  {

        this.identifiantCompte = identifiantCompte;
        this.soldeInitial = soldeInitial;
    }
    

    @Override public int getIdentifiantCompte() {
        return identifiantCompte;
    }

    public void setIdentifiantCompte(int identifiantCompte) {
        this.identifiantCompte = identifiantCompte;
    }

     @Override public double getSoldeInitial() throws SoldeNegatifException {
         if (soldeInitial<0) throw new SoldeNegatifException("votre solde est negatif" );

        return soldeInitial;
    }

    public void setSoldeInitial(double soldeInitial) {
        this.soldeInitial = soldeInitial;
    }

    @Override public void deposer(double montant)  {
        soldeInitial += montant;
    }

    @Override public void retirer(double montant) throws SoldeNegatifException ,SoldeInsuffisantException{
        if (soldeInitial<0) throw new SoldeNegatifException("votre solde est negatif" );
        if(soldeInitial < montant) throw new SoldeInsuffisantException("votre solde est insuffisant");
        soldeInitial -= montant;
    }

    @Override public void virement(double soldeAEnvoyer, Compte CompteDestinataire) throws SoldeNegatifException ,SoldeInsuffisantException{
        if (soldeInitial<0) throw new SoldeNegatifException("votre solde est negatif" );
        if(soldeInitial < soldeAEnvoyer) throw new SoldeInsuffisantException("votre solde est insuffisant");

        this.setSoldeInitial(this.getSoldeInitial()-soldeAEnvoyer);
        CompteDestinataire.setSoldeInitial(CompteDestinataire.getSoldeInitial()+soldeAEnvoyer);


        System.out.println(soldeAEnvoyer + " a été envoyé à" + CompteDestinataire);
    }

    abstract public void ajoutFrais(double frais) throws SoldeNegatifException;
}

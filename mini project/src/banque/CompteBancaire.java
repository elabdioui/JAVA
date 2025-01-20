package banque;

public interface CompteBancaire {

    double getSoldeInitial() throws SoldeNegatifException;
    int getIdentifiantCompte();
    void deposer(double montant);
    void retirer(double montant) throws SoldeNegatifException,SoldeInsuffisantException;
    void virement(double soldeAEnvoyer, Compte CompteDestinataire) throws SoldeNegatifException,SoldeInsuffisantException;

}

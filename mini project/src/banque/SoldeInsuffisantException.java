package banque;

public class SoldeInsuffisantException extends RuntimeException {
    public SoldeInsuffisantException(String message) {
        super("Votre solde est insuffisant: " + message);
    }
}

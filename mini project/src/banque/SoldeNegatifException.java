package banque;

public class SoldeNegatifException extends Exception {
    public SoldeNegatifException(String message) {
        super("Votre solde est negatif: " + message);
    }
}

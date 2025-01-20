package cntrl;

public class PrixInvalidException extends Exception {

    public PrixInvalidException() {

      super("prix negatif est impossible");
    }
}

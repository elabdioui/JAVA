package Test;

public class Test {

    private int taille;
    private double[] notes;

    public Test(int taille) {
        this.taille = taille;
        this.notes = new double[taille];
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        for (int i = 0; i < notes.length; i++) {
            this.notes[i] = notes[i];
        }
    }

    public double Somme(double[] notes) {
        double s = 0;
        for (int i = 0; i < notes.length; i++) {
            s += notes[i];
        }
        return s;
    }

    public double Moyenne(double[] notes) {
        try {
            if (notes == null || notes.length == 0) {
                throw new ArithmeticException("Le tableau des notes est vide, impossible de calculer la moyenne.");
            }
            return Somme(notes) / notes.length;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}

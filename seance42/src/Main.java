import java.lang.*;

public class Main {
    static int CalculerDivision(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("impossible de diviser par 0");
            return 0;
        }
    }
    static int CalculeMoyenne(int[] notes) {
        if (notes.length == 0) {
            throw new IllegalArgumentException("Impossible d'avoir un tableau vide");
        }


        int s = 0;
        for (int i = 0; i < notes.length; i++) {
                s += notes[i];
            }

            return s / notes.length;

        }

        static void traiterinput(String input) {

                int n = Integer.parseInt(input);
                System.out.println("convertie");




        }
    public static void main(String[] args) {

        System.out.println("la division:"+CalculerDivision(12,0));
        int[] notes = new int[3];
        notes[0] = 1;
        notes[1] = 2;
        notes[2] = 3;

        System.out.println("la moyenne:"+CalculeMoyenne(notes));
        String x=null;

        traiterinput(x);

    }
}
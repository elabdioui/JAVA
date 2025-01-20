import Test.Test;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre de notes: ");
        int taille = scanner.nextInt();

        Test test = new Test(taille);

        System.out.println("Entrez les notes : ");
        for (int i = 0; i < taille; i++) {
            System.out.print("Note " + (i + 1) + ": ");
            test.getNotes()[i] = scanner.nextDouble();
        }

        double somme = test.Somme(test.getNotes());
        double moyenne = test.Moyenne(test.getNotes());

        System.out.println("La somme des notes est: " + somme);
        System.out.println("La moyenne des notes est: " + moyenne);

        scanner.close();
    }
}

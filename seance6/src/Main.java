import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public int addition(int a, int b){
        return a+b;
    }
    public double soustraction(int a, int b){
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    static public double diviser(int a, int b) {
        try {
            return a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("impossible: la valeur de b est null ");
            return 0;
        }
    }
    static void manipulation(double [] tab,int taille){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("veuiller remplir le tableau ");
            for (int i = 0; i < taille; i++) {
                System.out.print("Entrez l'élément " + (i + 1) + " : ");
                tab[i] = scanner.nextDouble();
            }
        }
            catch(InputMismatchException e){
                System.out.println("impossible: veuiller remplir le tableau ");
            }

        }

    static double moyenne(double [] tab){
        if (tab == null) throw new NullPointerException("tableau de valeau null");
            double sum = 0;
            for(int i=0;i<tab.length;i++){
                if(i>tab.length || i<0 ) throw new ArrayIndexOutOfBoundsException("Vous avez depasser le tebleau");
                sum += tab[i];
            }
            return sum/tab.length;

        }

    static double max(double [] tab){
        if (tab == null) throw new NullPointerException("tableau de valeau null");

        double max = tab[0];
        for(int i=0;i<tab.length;i++){
            if(i>tab.length || i<0 ) throw new ArrayIndexOutOfBoundsException("Vous avez depasser le tebleau");
            if(tab[i]>max) {
                max = tab[i];
            }
        }
        return max;
    }
    static double min(double [] tab){
        if (tab == null) throw new NullPointerException("tableau de valeau null");
        double min = tab[0];
        for(int i=0;i<tab.length;i++){
            if(i>tab.length || i<0 ) throw new ArrayIndexOutOfBoundsException("Vous avez depasser le tebleau");
            if(tab[i]<min) {
                min = tab[i];
            }
        }
        return min;
    }
    static double sum(double [] tab){
        if (tab == null) throw new NullPointerException("tableau de valeau null");
        double sum = 0;
        for(int i=0;i<tab.length;i++){
            if(i>tab.length || i<0 ) throw new ArrayIndexOutOfBoundsException("Vous avez depasser le tebleau");
            sum += tab[i];

        }
        return sum;
    }
    static void tri(double [] tab){
        if (tab == null) throw new NullPointerException("tableau de valeau null");
        double x;
        for(int i=0;i<tab.length-1;i++){
            if(i>tab.length || i<0 ) throw new ArrayIndexOutOfBoundsException("Vous avez depasser le tebleau");
            if(tab[i]>tab[i+1]){
                x=tab[i];
                tab[i]=tab[i+1];
                tab[i+1]=x;

            }
        }
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a=5;int b=0;
        diviser(a,b);
        int t=5;
        double [] tab = new double[t] ;
        manipulation(tab,t);



        System.out.println( sum(tab));
        System.out.println(moyenne(tab));
        System.out.println(min(tab));
        System.out.println( max(tab));

        tri(tab);

    }
}
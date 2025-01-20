package Exercice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static <T> void swap(List<T> l1, List<T> l2) {

        List<T> temp = new ArrayList<>(l1);

        l1.clear();
        l1.addAll(l2);

        l2.clear();
        l2.addAll(temp);
    }
    public static <T extends Comparable<T>> T findMax(List<T> l1) {

        return l1.stream().max(Comparator.naturalOrder()).orElseThrow();
    }
    public static void printListe(List<? extends Number> l1){
        for(Number n : l1){
            System.out.println(n+" ");

        }

    }
    public static void Jour(List<Jour> list ){
        for(Jour j : list){
            System.out.println(j);
        }

    }

    public static void main(String[] args) {
        List<Integer> liste1 = new ArrayList<>();
        liste1.add(1);
        liste1.add(2);
        liste1.add(3);

        List<Integer> liste2 = new ArrayList<>();
        liste2.add(10);
        liste2.add(20);
        liste2.add(30);

        System.out.println("Avant l'échange :");
        System.out.println("Liste 1 : " + liste1);
        System.out.println("Liste 2 : " + liste2);

        swap(liste1, liste2);

        System.out.println("\nAprès l'échange :");
        System.out.println("Liste 1 : " + liste1);
        System.out.println("Liste 2 : " + liste2);


        System.out.println("le max de liste 1 :"+ findMax(liste1));
        printListe(liste1);

        Pair pair = new Pair("Haitham", 22);
        System.out.println(pair);

        int x = 5;
        System.out.println(x);
        int y = ~x;
        System.out.println(y);
        int z = -x;
        System.out.println(z);




    }
}

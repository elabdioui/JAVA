package Personne;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        ArrayList<Personne> personnes = new ArrayList<>();

        Personne p1 =new Personne("bla","p1",24);
        Personne p2 =new Personne("alb","p2",2);
        Personne p3 =new Personne("lab","p3",50);

        personnes.add(p1);
        personnes.add(p2);
        personnes.add(p3);


        personnes.forEach(x -> System.out.println(x.toString() ));
        personnes.sort(Comparator.comparing(Personne::getNom));
        personnes.forEach(x -> System.out.println(x.toString() ));
        personnes.sort(Comparator.comparing(Personne::getAge));
        personnes.forEach(x -> System.out.println(x.toString() ));


    }
}
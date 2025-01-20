package Affichage;

import Personne.Personne;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        int x=4;
        int y=5;
        String a="haitham";
        String b="hello";
        Personne p1 = new Personne("hi","hi",51);
        Personne p2 = new Personne("ho","ho",21);

        list.add(x);
        list.add(y);
        list.add(p1);
        list.add(p2);
        list.add(a);
        list.add(b);

        list.forEach(System.out::println);

    }
}
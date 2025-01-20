package com.location.main;

import vehicule.com.location.Moto;
import vehicule.com.location.Voiture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Voiture V1 = new Voiture("volvo","2012",250.0,4);
        Moto M1 = new Moto("M1","2012",150.0,3);

        V1.afficher();
        M1.afficher();
        System.out.println("entrer la duree");
        Scanner d=new Scanner(System.in);
        int du=d.nextInt();
        System.out.println(V1.prix(du));

    }
}
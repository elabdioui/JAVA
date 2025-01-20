package Ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public  class GardeEnfants {

    private static void AfficherNaissance(String e){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour " + e+" tu es ne en quelle annee?");
        int annee = sc.nextInt();
        int now = LocalDate.now().getYear();
        System.out.println(e+":"+ (now-annee) );

    }



    public static void main(String[] args) {

        List<String> s = new ArrayList<>(List.of("Ali","Anass","Jannah","Youssef","Nada","Joud"));

        s.forEach(GardeEnfants::AfficherNaissance);
    }
}

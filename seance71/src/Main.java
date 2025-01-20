import Bib.Livre;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Livre L1= new Livre("t3","a1",2010);
        Livre L2= new Livre("t2","a2",2010);
        Livre L3= new Livre("t1","a3",2010);
        Livre L4= new Livre("t4","a4",2010);

        Set<Livre> set = new HashSet<>(List.of(L1,L2,L3,L4));
        for (Livre livre : set) {
            System.out.println(livre);
        }

        System.out.println("---------------------------------------");

        Set<Livre> livresTries = new TreeSet<>(set);
        for (Livre livre : livresTries) {
            System.out.println(livre);
        }
        System.out.println("---------------------------------------");
        System.out.println(((TreeSet<Livre>) livresTries).first());
        System.out.println(((TreeSet<Livre>) livresTries).last());





    }
}
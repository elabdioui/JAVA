import java.util.*;

public class Main {


    public static void main(String[] args) {

        Map<String,String> carnetAdress = new TreeMap<String,String>();
        carnetAdress.put("haitham","0666");
        carnetAdress.put("Honda","0777");
        carnetAdress.get("Honda");
        if(carnetAdress.containsKey("haitham")) { System.out.println("EXISTE"); }
        else { System.out.println("NOT EXISTE"); }
        for (Map.Entry e : carnetAdress.entrySet()) {
            System.out.println("key :" + e.getKey() + " value :" + e.getValue());
        }
        carnetAdress.remove("Honda");
        for (Map.Entry e : carnetAdress.entrySet()) {
            System.out.println("key :" + e.getKey() + " value :" + e.getValue());
        }

        System.out.println("-------------------------------------------------");

        ArrayList<String> Produits= new ArrayList<>();
        Produits.add("pates");
        Produits.add("Lentilles");
        Produits.add("Pain");
        Produits.add("Eau");
        Produits.add("Riz");
        Produits.add("Chocolat");
        for (var p: Produits) {
            System.out.println(p);
        }
        Produits.remove("Eau");
        for (var p: Produits) {
            System.out.println(p);
        }
        System.out.println("Lait est présent : " + Produits.contains("Lait"));
        System.out.println("Produit à l'index 4 : " + Produits.get(4));
        Produits.set(4, "Lait");

        System.out.println("-------------------------------------------------");

        LinkedList<String> Commandes = new LinkedList<>(Produits);

        Commandes.addFirst("bimo");
        Commandes.removeFirst();
        Commandes.getFirst();
        Commandes.getLast();
        for (var p: Commandes) {
            System.out.println(p);
        }
        System.out.println("-------------------------------------------------");

        Set<String> SansDouble  = new HashSet<>(Commandes);
        for (var p: SansDouble) {
            System.out.println(p);
        }

        System.out.println("-------------------------------------------------");

       Set<String> Link=new LinkedHashSet<>(Commandes);
        for (var p: SansDouble) {
            System.out.println(p);
        }


        System.out.println("-------------------------------------------------");

        Set<String> Tree=new TreeSet<>(Commandes);
        for (var p: SansDouble) {
            System.out.println(p);
        }


    }
}
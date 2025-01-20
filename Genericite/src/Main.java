import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bibliotheque<String> b1= new Bibliotheque<>();
        b1.addElement("Bonjour");
        b1.addElement("Jean");
        b1.addElement("Michael");

        b1.affiche();

        List<Integer> l = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10,11));

        Bibliotheque<Integer> b2= new Bibliotheque<>(l);


    }
}
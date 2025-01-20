import cntrl.*;

import cntrl.GestProd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PrixInvalidException {

        Livre l1 = new Livre("t1","a1",1);
        Livre l11 = new Livre("t1","a1",1);
        Livre l111 = new Livre("t1","a1",1);
        Livre l2 = new Livre("t2","a2",2);
        Livre l3 = new Livre("t3","a3",3);

        ArrayList<Livre> livres = new ArrayList<>(Arrays.asList(l1, l11, l111, l2, l3));


        GestionBibliotheque g = new GestionBibliotheque(livres);
        Livre l5 = new Livre("t5","a1",5);
        g.AjouterLivre(l5);
        g.AfficherLivre();
        g.TrierParPrix();
        g.AfficherLivre();

        System.out.println(g.CalculeMoyenne("a1"));
        System.out.println("-----------------------------------------------------------------");
        LinkedList<Produit> list = new LinkedList<>();
        Produit p1 = new Produit(1,"p1","bien", 200.0);
        Produit p2 = new Produit(25,"alaa","bon", 2000.0);
        Produit p3 = new Produit(30,"haitham","bon", 22.0);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        GestProd gp = new GestProd(list);

        gp.afficher();
        gp.TrierParNom();
        gp.afficher();
        gp.trierparPrix();
        gp.afficher();
        gp.Supprimer();
        gp.afficher();







    }
}
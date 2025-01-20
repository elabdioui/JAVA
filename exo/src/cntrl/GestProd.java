package cntrl;

import java.util.LinkedList;

import static java.lang.CharSequence.compare;

public class GestProd {

        private LinkedList<Produit> list = new LinkedList<>();

        public GestProd() {

        }
        public GestProd(LinkedList<Produit> list) {
            this.list = list;
        }
        public LinkedList<Produit> getList() {
            return list;
        }
        public void setList(LinkedList<Produit> list) {
            this.list = list;
        }



        public void TrierParNom (){
            list.sort((p1, p2) -> compare(p1.getNom(), p2.getNom()));
        }
        public void trierparPrix(){
            list.sort((p1,p2) -> Double.compare(p1.getPrix(),p2.getPrix()));
        }
        public void Supprimer(){
            list.removeIf(p -> p.getPrix() >300);
        }
        public void afficher(){
            list.forEach(p -> System.out.println(p));
        }
}

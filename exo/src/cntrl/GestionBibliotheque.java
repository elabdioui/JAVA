package cntrl;

import java.util.ArrayList;

public class GestionBibliotheque {

    private ArrayList<Livre> livres;

    public GestionBibliotheque(ArrayList<Livre> livres) {
        this.livres = livres;
    }
    public ArrayList<Livre> getLivres() {
        return livres;
    }
    public void setLivres() {
        this.livres = livres;
    }
    public void AjouterLivre(Livre livre) {
        this.livres.add(livre);
    }
    public void TrierParPrix(){
        livres.sort((l1,l2) -> Double.compare(l1.getPrix(), l2.getPrix()));
    }
    public void AfficherLivre() {
        livres.forEach(l -> System.out.println(l));
    }
    public double CalculeMoyenne(String auteur) throws PrixInvalidException {
        double s=0;
        for (Livre livre : livres) {
            if (livre.getAuteur().equals(auteur)) {
                if (livre.getPrix()<0) throw new PrixInvalidException();
                s+=livre.getPrix();
            }
        }
        return s;
    }

}

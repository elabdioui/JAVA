package Bib;

import java.util.Objects;

public class Livre implements Comparable<Livre> {
    private String titre;
    private String auteur;
    private int annee;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    @Override
    public int compareTo(Livre other) {
        return this.titre.compareTo(other.titre);
    }

    @Override
    public String toString() {
        return
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", annee=" + annee
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return annee == livre.annee && titre.equals(livre.titre) && auteur.equals(livre.auteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, auteur, annee);
    }
}

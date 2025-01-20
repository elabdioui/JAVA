package Personne;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Etudiant extends Personne {

    private String appreciation;
    private Specialite specialite;
    private double[] notesPremiereSemestre;
    private double[] notesDeuxiemeSemestre;
    private int taille1;
    private int taille2;

    public Etudiant(String nom, String prenom, int age, String appreciation, Specialite specialite, int nbr) {
        super(nom, prenom, age);
        this.appreciation = appreciation;
        this.specialite = specialite;
        this.notesPremiereSemestre = new double[nbr];
        this.notesDeuxiemeSemestre = new double[nbr];
        this.taille1 = 0;
        this.taille2 = 0;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public double[] getNotesPremiereSemestre() {
        return Arrays.copyOf(notesPremiereSemestre, taille1);
    }

    public double[] getNotesDeuxiemeSemestre() {
        return Arrays.copyOf(notesDeuxiemeSemestre, taille2);
    }

    public void afficheRole() {
        System.out.println("Role : Etudiant");
    }

    public void EnregistrerNotesPremiereSemestre(int nbr) {

        Scanner scanner = new Scanner(System.in);
        if (taille1 < notesPremiereSemestre.length) {
            for (int i = 0; i < nbr; i++) {

                System.out.print("Entrez la note " + (i + 1) + " pour le premier semestre: ");
                notesPremiereSemestre[taille1++] = scanner.nextDouble();
            }
        } else {
            System.out.println("Capacité maximale atteinte pour le premier semestre.");
        }

        System.out.println("Notes du premier semestre enregistrées : " + Arrays.toString(getNotesPremiereSemestre()));
    }

    public void EnregistrerNotesDeuxiemeSemestre(int nbr) {
        Scanner scanner = new Scanner(System.in);
        if (taille2 < notesDeuxiemeSemestre.length) {
            for (int i = 0; i < nbr; i++) {

                System.out.print("Entrez la note " + (i + 1) + " pour le deucime semestre: ");
                notesDeuxiemeSemestre[taille2++] = scanner.nextDouble();
            }
        } else {
            System.out.println("Capacité maximale atteinte pour le deuxiem semestre.");
        }

        System.out.println("Notes du deuciem semestre enregistrées : " + Arrays.toString(getNotesDeuxiemeSemestre()));
    }

    public Double MoyennePremiereSemestre(double[] notesPremiereSemestre) {
        double s = 0;
        for (int i = 0; i < notesPremiereSemestre.length; i++) {
            s += notesPremiereSemestre[i];
        }
        return s / notesPremiereSemestre.length;
    }

    public Double MoyenneDeuxiemSemestre(double[] notesDeuxiemeSemestre) {
        double s = 0;
        for (int i = 0; i < notesDeuxiemeSemestre.length; i++) {
            s += notesDeuxiemeSemestre[i];
        }
        return s / notesDeuxiemeSemestre.length;
    }

    public String toString() {
        return
                "Notes 1er semestre: " + Arrays.toString(getNotesPremiereSemestre()) +
                        "Notes 2ème semestre: " + Arrays.toString(getNotesDeuxiemeSemestre());
    }

    public int ChercherNote(double n) {
        int index = chercherDansTableau(notesPremiereSemestre, n, taille1);
        return (index != -1) ? index : chercherDansTableau(notesDeuxiemeSemestre, n, taille2);
    }

    private int chercherDansTableau(double[] tableau, double n, int count) {
        for (int i = 0; i < count; i++) {
            if (tableau[i] == n) {
                return i;
            }
        }
        return -1; // Not found
    }

    public void comparerNotes() {
        // Compare les deux tableaux de notes
        System.out.println("Comparaison des notes :");
        System.out.println("Notes 1er semestre : " + Arrays.toString(getNotesPremiereSemestre()));
        System.out.println("Notes 2ème semestre : " + Arrays.toString(getNotesDeuxiemeSemestre()));

        int minLength = Math.min(taille1, taille2);

        for (int i = 0; i < minLength; i++) {
            double note1 = notesPremiereSemestre[i];
            double note2 = notesDeuxiemeSemestre[i];
            if (note1 > note2) {
                System.out.println("Note " + (i + 1) + " 1er semestre (" + note1 + ") est supérieure à 2ème semestre (" + note2 + ").");
            } else if (note1 < note2) {
                System.out.println("Note " + (i + 1) + " 2ème semestre (" + note2 + ") est supérieure à 1er semestre (" + note1 + ").");
            } else {
                System.out.println("Note " + (i + 1) + " est égale pour les deux semestres.");
            }
        }
    }

    public void trierNotesPremiereSemestre() {
        Arrays.sort(notesPremiereSemestre, 0, taille1);
        System.out.println("Notes du premier semestre triées : " + Arrays.toString(getNotesPremiereSemestre()));
    }

    public void trierNotesDeuxiemeSemestre() {
        Arrays.sort(notesDeuxiemeSemestre, 0, taille2);
        System.out.println("Notes du deuxième semestre triées : " + Arrays.toString(getNotesDeuxiemeSemestre()));
    }

    public double[] convertirNotesPremiereSemestreEnTableau() {
        return Arrays.copyOf(notesPremiereSemestre, taille1);
    }

    public double[] convertirNotesDeuxiemeSemestreEnTableau() {
        return Arrays.copyOf(notesDeuxiemeSemestre, taille2);
    }

    public boolean testErrorNom() {
        if (this.getNom().equals(this.getPrenom()))
            return true;
        else return false;
    }

    public int calculeNom() {
        return this.getNom().length();
    }

    public int calculePrenom() {
        return this.getPrenom().length();
    }

    private String NomComplet (){

    }

    public String ManipilerAppreciation(Etudiant etudiant) {
        if (etudiant.getAppreciation() == "bien") {
            return "positif";
        } else if (etudiant.getAppreciation() == "mauvais") {
            return "negatif";


        }

    }

}

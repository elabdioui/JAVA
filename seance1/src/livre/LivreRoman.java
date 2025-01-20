package livre;

public class LivreRoman extends Livre {
    private String genre;
    public LivreRoman(String titre, String auteur, int anneePub, String genre) {
        super(titre, auteur, anneePub);
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Roman genre: " + genre);
    }
}

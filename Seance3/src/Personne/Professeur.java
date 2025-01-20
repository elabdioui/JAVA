package Personne;

public class Professeur extends Personne {

    private String MatiereEnseingee;

    public Professeur(String nom, String prenom, int age,String MatiereEnseingee){
        super(nom, prenom, age);
        this.MatiereEnseingee = MatiereEnseingee;
    }
    public String getMatiereEnseingee() {
        return MatiereEnseingee;
    }
    public void setMatiereEnseingee(String MatiereEnseingee) {
        this.MatiereEnseingee = MatiereEnseingee;
    }
    @Override  public void afficheRole(){
        System.out.println("Role : Professeur");
    }
}

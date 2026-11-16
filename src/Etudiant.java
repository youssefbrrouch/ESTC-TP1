public class Etudiant {

    private String nom;
    private String prenom;
    private String CNE;
    public Etudiant(String nom, String prenom, String CNE) {
        this.nom = nom;
        this.prenom = prenom;
        this.CNE = CNE;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCNE() {
        return CNE;
    }
    public void setCNE(String CNE) {
        this.CNE = CNE;
    }
    public void afficher() {
        System.out.println("Nom : " + nom+", Prenom : " + prenom+", CNE : " + CNE);
    }
    
}

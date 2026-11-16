public class Livre {

    private String titre;
    private String auteur;
    private int nbPages;

    public Livre() {
        this.titre = "";
        this.auteur = "";
        this.nbPages = 0;
    }
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = 0;
    }
    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public  String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public int getNbPages() {
        return nbPages;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }
    public boolean plusVolumineuxQue(Livre l)
    {
        return this.nbPages > l.nbPages;

    }
    public static  boolean plusVolumineuxQue(Livre l1, Livre l2)
    {
        return l1.nbPages > l2.nbPages;
    }
    public boolean aMemeAuteurQue(Livre l)
    {
        return this.auteur.equals(l.auteur);
    }
    public static boolean aMemeAuteurQue(Livre l , Livre l2)
    {
        return l.auteur.equals(l2.auteur);
    }

    @Override
    public String toString() {
        return "Livre{" +
            "titre='" + titre + '\'' +
            ", auteur='" + auteur + '\'' +
            ", nbPages=" + nbPages +
            '}';
    }

}

public class Traitement {

    public static void main(String[] args) {
    Etudiant e1= new Etudiant("Nom Etu 1", "Prenom  Etu 1", "CNE  Etu 1");
    e1.afficher();
    e1.setNom("Nom 2");
    e1.afficher();

    Etudiant e2= new Etudiant("Nom  Etu 2", "Prenom  Etu 2", "CNE  Etu 2");
    e2.afficher();
    e2.setPrenom(e1.getPrenom());
    e2.afficher();

    }

}

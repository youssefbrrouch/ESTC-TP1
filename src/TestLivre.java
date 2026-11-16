public class TestLivre {
    public static void main(String[] args)
    {
        
   
        Livre l1 = new Livre();
        l1.setTitre("Au Cœur de java : Notions Fondamentales");
        l1.setAuteur("Horstman");
        l1.setNbPages(820);

        Livre l2 = new Livre("Entreprise Java Bean", "Richard Monson-Haefel", 568);

        Livre l3 = new Livre("Au Cœur de java : Fonctions Avancées", "Horstman", 950);

     

         System.out.println("Titre: " + l1.getTitre());
        System.out.println("Auteur: " + l1.getAuteur());
        System.out.println("NbPages: " + l1.getNbPages());

         System.out.println(l1.getTitre() + " est plus Volumineux que "+ l2.getTitre()+" " + l1.plusVolumineuxQue(l2));
 
        System.out.println(l1.getTitre() + " est plus Volumineux que "+ l2.getTitre()+" " + Livre.plusVolumineuxQue(l1, l2));
 
        System.out.println(l1.getTitre()+ " a meme auteur que  "+ l2.getTitre() + " " + l1.aMemeAuteurQue(l2));
 
        System.out.println(l1.getTitre()+ " a meme auteur que  "+ l2.getTitre() + " " + Livre.aMemeAuteurQue(l1, l3));
 
        int totalNbPages = l1.getNbPages() + l2.getNbPages();
        System.out.println("Total number of pages (l1 + l2): " + totalNbPages);
        


    }

}

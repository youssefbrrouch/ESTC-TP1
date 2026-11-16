import java.util.Scanner;

public class ManipuleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A. Conversion d'un entier en chaine.
        int nbr = 123;
        String strNbr = String.valueOf(nbr);
        System.out.println("A. Entier converti en chaine : \"" + strNbr + "\"");

        // B. Suppression des blancs aux extremites et passage en majuscules.
        System.out.println("\nB. Taper une chaine :");
        String chaine = scanner.nextLine();
        System.out.println("Resultat : " + chaine.trim().toUpperCase());

        // C. Comparaison du premier caractere, si les chaines sont non vides.
        System.out.println("\nC. Taper s1 puis s2 (une chaine par ligne) :");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        boolean memeDebut = !s1.isEmpty() && !s2.isEmpty()
                && s1.charAt(0) == s2.charAt(0);
        System.out.println("Meme premier caractere : " + memeDebut);

        // D. == compare les references ; equals compare le contenu.
        System.out.println("\nD. Taper s1 puis s2 (une chaine par ligne) :");
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        afficherComparaisons(s1, s2);

        // Objets distincts pour illustrer les comparaisons comme avec une saisie.
        System.out.println("\nTest : s1 = abcd, s2 = abcd");
        afficherComparaisons(new String("abcd"), new String("abcd"));
        System.out.println("\nTest : s1 = abcd, s2 = AbcD");
        afficherComparaisons(new String("abcd"), new String("AbcD"));

        // E. Recherche d'un prefixe, d'un suffixe et d'une sous-chaine.
        System.out.println("\nE. Taper s1 puis s2 (une chaine par ligne) :");
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        System.out.println("s1 commence par s2 : " + s1.startsWith(s2));
        System.out.println("s1 finit par s2 : " + s1.endsWith(s2));
        System.out.println("s1 contient s2 : " + s1.contains(s2));

        // F. Suppression de la premiere occurrence de s2 avec substring.
        System.out.println("\nF. Taper s1 puis s2 (une chaine par ligne) :");
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        int position = s1.indexOf(s2);
        String resultat = s1;
        if (position != -1) {
            resultat = s1.substring(0, position)
                    + s1.substring(position + s2.length());
        }
        System.out.println("Resultat : " + resultat);

        // G. intern donne la meme reference aux chaines de meme contenu.
        System.out.println("\nG. Taper s1 puis s2 (une chaine par ligne) :");
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        System.out.println("Avant intern :");
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1 == s2 : " + (s1 == s2));
        s1 = s1.intern();
        s2 = s2.intern();
        System.out.println("Apres intern :");
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1 == s2 : " + (s1 == s2));

        scanner.close();
    }

    private static void afficherComparaisons(String s1, String s2) {
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));
        System.out.println("s1.compareToIgnoreCase(s2) : " + s1.compareToIgnoreCase(s2));
    }
}

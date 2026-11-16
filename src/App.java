import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner stdin = new Scanner(System.in);
            System.out.print("Donner un entier de type byte(-128 à 127) :");
            byte b = stdin.nextByte();
            System.out.print("Donner un entier de type short (-32768 à 32767) :");
            short h = stdin.nextShort();
            System.out.print("Donner un entier de type int (-2^31 à 2^31-1) :");
            int n = stdin.nextInt();
            System.out.print("Donner un entier de type long (-2^63 à 2^63-1) :");
            long l = stdin.nextLong();
            System.out.print("Donner un réel de type float (utiliser , pour partie fractionnaire) :");
            float f = stdin.nextFloat();
            System.out.print("Donner un réel de type double (utiliser , pour partie fractionnaire) :");
            double d = stdin.nextDouble();
            System.out.println("Donner une suite de tokens séparés par des espaces :");
            String s1 = stdin.next(); 
            String s2 = stdin.nextLine();
            System.out.println("b = " + b + "\th = " + h + "\tn = " + n + "\tl = " + l);
            System.out.println("f = " + f + "\td = " + d);
            System.out.println("s1 = " + s1 + "\ts2 = " + s2);
            stdin.close();
        } catch (InputMismatchException e) {
            System.out.println("Vous avez saisie une valeur erronée "

                    + "\nAttention : utiliser la virguel et non le point pour les nombres décimaux : " +

                    e);
        }
    }
}

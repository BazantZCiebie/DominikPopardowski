import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        System.out.println("Podaj nazwe miasta:");
        String miasto= kl.nextLine();
        int dlugosc;
        dlugosc = miasto.length();

        System.out.println(dlugosc);
        String male, duze;

        male = miasto.toLowerCase();
        duze = miasto.toUpperCase();
        char lel = miasto.charAt(0);
        System.out.println(miasto + ", " + duze+ ", " +male+ ','+lel);
    }
}

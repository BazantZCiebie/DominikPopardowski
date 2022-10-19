import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        System.out.println("Podaj cene detaliczna: ");
        int detal = kl.nextInt();
        double zysk;
        zysk=detal*0.4;

        System.out.println("Zysk wynosi: "+zysk+ "zl");
    }
}

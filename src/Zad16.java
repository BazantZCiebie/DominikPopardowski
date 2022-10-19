import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        System.out.println("Podaj cene posiku:");
        int posilek = kl.nextInt();
        //double posilek;
        double poSZpodatek;
        double poSZnapiwek;
        double suma;
        double napiwek = 0.20;
        double podatek = 0.0675;
        poSZpodatek = posilek * podatek;
        poSZnapiwek = (poSZpodatek+posilek)* napiwek;

        suma = posilek + poSZnapiwek + poSZpodatek;

        System.out.println("Podatek wynosi: " + poSZpodatek + "zl");
        System.out.println("Napiwek wynosi: " + poSZnapiwek + "zl");
        System.out.println("Cena za danie wynosi: " + suma + "zl");
    }
}

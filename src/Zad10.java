import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cene produktu:");
        double produkt = klawiatura.nextInt();
        double Sta=0.04;
        double Lok=0.02;
        double produktZPod;
        double podSta;
        double podLok ;

                podLok=produkt*Lok;
                podSta=produkt*Sta;
                produktZPod=produkt+podSta+podLok;
        System.out.println("Podatek stanowczy wynosi:" +podSta + "zl \n Podatek lokalny wynosi: " + podLok + "zl \n Cena produktu wynosi: " +produktZPod+ "zl");

    }
}

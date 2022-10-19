import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbe przejechanych kilometrow:");
        int kilometry =klawiatura.nextInt();
        System.out.println("Podaj liczbe zuzytego paliwa:");
        int paliwo =klawiatura.nextInt();

        int litrNaKilometr;
        litrNaKilometr=kilometry/paliwo;

        System.out.println("Pojazd przejcahal: "+litrNaKilometr+ "Km na litr");
    }
}

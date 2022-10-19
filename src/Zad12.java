import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int porcjaKal;
        int ciastko;
        int kalorie=300;
        int porcja=4;

        ciastko=kalorie/porcja;
        System.out.println("Ile zjadles ciasteczek?" );
        int zjedzone =klawiatura.nextInt();
        porcjaKal=zjedzone*ciastko;
        System.out.println("Zjadles"+porcjaKal+ "kalori");





    }
}

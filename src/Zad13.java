import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        System.out.println("Podaj wynik 1 testu: ");
        int test1 =kl.nextInt();
        System.out.println("Podaj wynik 2 testu: ");
        int test2 =kl.nextInt();
        System.out.println("Podaj wynik 3 testu: ");
        int test3 =kl.nextInt();

        double suma;

        suma=(test1+test2+test3)/3;

        System.out.println("Srednia testow wynosi: "+suma+ "%");

    }
}

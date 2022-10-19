public class Zad17 {
    public static void main(String[] args) {
        double cena=21.77;
        double akcja=600;
        double prowizja=0.02;
        double cenaAkcji;
        double cenaprowizji;
        double suma;

        cenaAkcji=cena*akcja;
        cenaprowizji=cenaAkcji*prowizja;
        suma=cenaAkcji+cenaprowizji;
        System.out.println("Cena akcji wynosi: "+ cenaAkcji);
        System.out.println("Cena prowizji wynosi: "+ cenaprowizji);
        System.out.println("Suma wynosi: "+ suma);
    }
}

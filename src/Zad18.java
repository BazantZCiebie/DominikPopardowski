public class Zad18 {

    public static void main(String[] args) {
        double ludzie=12467;
        double energy=0.14;
        double cytrus=0.64;
        double napoj1;
        double napoj2;

        napoj1=ludzie*energy;
        napoj2=napoj1*cytrus;

        System.out.println("Napoj energetyczny kupuje:"+napoj1+" osob");
        System.out.println("Napoj cytynowy kupuje:"+napoj2+" osob");
    }
}

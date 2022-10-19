public class Zad5 {

    public static void main(String[] args) {

        int pokoj1;
        int pokoj2;
        int pokoj3;
        int pokoj4;
        int pokoje;
        int wym1pokoj1=4;
        int wym2pokoj1=3;
        int wym1pokoj2=4;
        int wym2pokoj2=3;
        int wym1pokoj3=2;
        int wym2pokoj3=3;
        int wym1pokoj4=2;
        int wym2pokoj4=2;

        pokoj1=(wym1pokoj1*wym2pokoj1);
        pokoj2=(wym1pokoj2*wym2pokoj2);
        pokoj3=(wym1pokoj3*wym2pokoj3);
        pokoj4=(wym1pokoj4*wym2pokoj4);
        pokoje=(pokoj1+pokoj2+pokoj3+pokoj4);
        System.out.println("Powieszchnie przypadajace na 1 osobe wynosi\n W pokoju 1:"+ pokoj1 +"\n w pokoju 2:" +
                pokoj2 +"\n w pokoju 3:"+pokoj3 +"\n w pokoju 4: "+pokoj4 +"\n A Ogolnie na jedną osobe przypada "+pokoje+" Powieszchni");
    }
}

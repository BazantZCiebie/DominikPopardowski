public  class Zad6 {

    public static void main(String[] args) {

        double pokoj1;
        double pokoj2;
        double pokoj3;
        double pokoj4;
        double pokoje;
        int wym1pokoj1=4;
        int wym2pokoj1=3;
        int wym1pokoj2=4;
        int wym2pokoj2=3;
        int wym1pokoj3=2;
        int wym2pokoj3=3;
        int wym1pokoj4=2;
        int wym2pokoj4=2;
        double pokoj10;
        double pokoj20;
        double pokoj30;
        double pokoj40;
        double pokoje0;

        pokoj1=wym1pokoj1*wym2pokoj1;
        pokoj2=wym1pokoj2*wym2pokoj2;
        pokoj3=wym1pokoj3*wym2pokoj3;
        pokoj4=wym1pokoj4*wym2pokoj4;
        pokoje=pokoj1+pokoj2+pokoj3+pokoj4 ;
        pokoj10=pokoj1/4;
        pokoj20=pokoj2/4;
        pokoj30=pokoj3/4;
        pokoj40=pokoj4/4;
        pokoje0=pokoje/4;
        System.out.println("Powieszchnie przypadajace na 1 osobe wynosi\n W pokoju 1:"+ pokoj10 +"\n w pokoju 2:" +
                pokoj20 +"\n w pokoju 3:"+pokoj30 +"\n w pokoju 4: "+pokoj40 +"\n A Ogolnie na jedną osobe przypada "+pokoje0+" Powieszchni");
    }
}


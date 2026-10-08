public class Rekursion {
    // Rekursion: Funktion ruft sich selbst auf (Fibonacchi, Euklid, Hanoi)
    public static long rekursiv_fakultaet(int wert ) {
    if(wert==0){
        return 1;
    }
    else{
        return wert* rekursiv_fakultaet(wert-1);
    }
    }
    //n!=     3!= 3*2*1= 6     4!=4*3*2*1=24
    // 0!= 1!= 1
    public static long fakulteat(int wert){
        long ergebnis = 1;
        while (wert> 1){
            ergebnis = ergebnis * wert;
            wert--;

    }
        return ergebnis;
    }
    public static void main(String[] args) {
        System.out.println("fak(4): " + fakulteat(4));
        System.out.println("fak(4): "+ rekursiv_fakultaet(4));
    }

}

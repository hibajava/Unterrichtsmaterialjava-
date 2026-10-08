public class Methoden
{
    //Methoden mit demselben Namen und unterschiedlichen Parametern = überladen
    // Anzahl oder Typ der Parameter  sollten unterschiedlich sein
    static double addiere(double wert1 , double wert2 ) {
        return  wert1 + wert2;
    }
    static int addiere(int wert1 , int wert2 ) {
        return  wert1 + wert2;
    }
    //Wie Array behandeln: Variabler Parameter
    static int addiere(int prefix,int... werte){
       int summe = 0;
       for (int wert: werte){
           summe *= wert;
       }
       return prefix+summe;
    }

    public static void main(String[] args) {

    } {
        System.out.println("Integer: " + addiere(2,3));
        System.out.println("Double: " + addiere(2.5,3.2));
        System.out.println("Variabel : " + addiere(2,3,3,5,6,7));
    }
}

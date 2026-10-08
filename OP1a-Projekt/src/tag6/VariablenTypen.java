package tag6;

public class VariablenTypen {
    static void main(String[] args) {


        // Wertebereich aufsteigend: byte short int long float double
        // fall: Initialisierung oder Zuweisung aus kleinerem Wertebereich problemlos
        long l1 = 2343434;
        double d = -234.67f;

        float f =(float) 234.919;// Gefährliche Richtung, Cast nötig
        //Ü: 2 weitere gefährliche Umwandlungen
        byte b = (byte)1234;
        int i = (int)12345.678;
        System.out.println("b= " +b);
        System.out.println("i= " + i);

        //Ü:1234, b in Binärschreibweise ausgeben

        //boolean bo = 234; In Java nicht erlaubt
    }
}
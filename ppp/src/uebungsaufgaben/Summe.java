package uebungsaufgaben;

import java.math.BigDecimal;

//Die Klasse
public class Summe
{
    //Die Main-Methode
    public static void main(String[] args)
    {
        //Unsere Variablen
        double a = 1.2345;
        double b = 2.3456;
        double c = 3.4567;

        double summe = a + b + c;

        //Die formatierte Konsolenausgabe mit printf();
        System.out.printf("%.4f + %.4f + %.4f = %.4f", a, b, c, summe);

        //------------------------------------
        //---Zum Testen (Thema Genauigkeit)---
        //------------------------------------
        double x = 35.14159265;
        float y = 35.14159265f;
        System.out.printf("%nx = %f%n", x);
        System.out.printf("%ny = %f", y);
    }
}
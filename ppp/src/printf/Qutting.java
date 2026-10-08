
package printf;

public class Qutting
{
    //Die Main-Methode
    public static void main(String[] args)
    {
        //Unsere Variablen
        String artikel1 = "Brot";
        double preis1 = 111.50;

        String artikel2 = "Milch";
        double preis2 = 0.99;

        String artikel3 = "Butter";
        double preis3 = 2.49;

        double gesamt = preis1 + preis2 + preis3;

        //Die (formatierte) Konsolenausgabe
        System.out.println("=========================\nRechnung\n=========================");
        System.out.printf("%-10s\t\t%s%n", "Artikel", "Preis");
        System.out.printf("%-10s\t\t%.2f €%n", artikel1, preis1);
        System.out.printf("%-10s\t\t%.2f €%n", artikel2, preis2);
        System.out.printf("%-10s\t\t%.2f €%n", artikel3, preis3);

        System.out.println("--------------------------");
        System.out.printf("%-10s\t\t%.2f €%n", "Gesamt:", gesamt);
        System.out.println("==========================");

    }
}


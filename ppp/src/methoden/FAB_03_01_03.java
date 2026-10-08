package methoden;

import java.util.Random;

public class FAB_03_01_03 {
    //Eine eigene Methode
    public static String wochentag(int zuf)
    {
        String wochentag;

        switch(zuf)
        {
            case 1:
                wochentag = "Montag";
                break;
            case 2:
                wochentag = "Dienstag";
                break;
            case 3:
                wochentag = "Mittwoch";
                break;
            case 4:
                wochentag = "Donnerstag";
                break;
            case 5:
                wochentag = "Freitag";
                break;
            case 6:
                wochentag = "Samstag";
                break;
            case 7:
                wochentag = "Sonntag";
                break;
            default:
                wochentag = "Kein gültiger Tag";
        }

        return wochentag;
    }

    //Die Main-Methode
    public static void main(String[] args)
    {
        Random rand = new Random();
        int zufallszahl;

        //3 Zufallszahlen mit entsprechenden 3 Wochentagen
        for(int i = 0; i < 3; i++)
        {
            System.out.println("****************Hauptprogramm****************");
            zufallszahl = rand.nextInt(1, 8);  //zwischen 1 und 7
            System.out.printf("%d. Zufallszahl zwischen 1 und 7: %d%n", i + 1, zufallszahl);

            System.out.println("*******************Funktion******************");

            System.out.printf("Die Zahl %d entspricht dem Wochentag: %s%n", zufallszahl, wochentag(zufallszahl));
        }
    }
}

package aufgaben.lösung_6;

/* Level 3
    Offene Aufgabenstellung:

        Betrachten Sie bitte zunächst den Screenshot und berücksichtigen hierzu folgende Informationen:
        a) Ein Mitarbeiter erhält ausschließlich ein Grundgehalt (Zufallszahl zwischen 1900 und 2100)
        b) Ein Vorgesetzter erhält ein Grundgehalt (zwischen 3700 und 4300) sowie ein Bonus (zwischen 450 und 550)
        c) Ein Vorstandsvorsitzender erhält ein Grundgehalt (zwischen 7500 und 8500) ein Bonus (2500 bis 3100) + prozentualer Aufschlag (5% bis 15%)
        d) Es gibt 20 Mitarbeiter, 5 Vorgesetzte und 2 Vorstandvorsitzende
        e) Der Umsatz soll frei gewählt werden können
        f) Der Gewinn ergibt sich aus Umsatz - Löhne

    Zielsetzung:

        Entwickeln Sie bitte ein Programm-Design und implementieren Sie dieses, wobei folgende Qualitätsmerkmale angestrebt werden sollen:
        a) Versuchen Sie möglichst viele Felder und Methoden abzukapseln
        b) Bemühen Sie sich bitte um eine konsequente Vererbungshierarchie, um Redundanzen zu vermeiden
        c) Lassen Sie die gesamte Konsolenausgabe durch eine einzige Methode ausgeben
*/



import java.util.Random;

public class Lösung_6
{
    public static void main(String[] args)
    {

        Random zG = new Random();

        for (int i = 0; i < 20; i++)
            new Mitarbeiter(zG.nextInt(2100 - 1900  + 1) + 1900);
        for (int i = 0; i < 5; i++)
            new Vorgesetzter(zG.nextInt(550 - 450 + 1) + 450, zG.nextInt(4300 - 3700 + 1) + 3700);
        for (int i = 0; i < 2; i++)
            new Vorstand(zG.nextInt(15 - 5 + 1) + 5, zG.nextInt(3100 - 2500 + 1) + 2500, zG.nextInt(8500 - 7500 + 1) + 7500);

        System.out.println(Mitarbeiter.getGehälter(100000));

    }
}


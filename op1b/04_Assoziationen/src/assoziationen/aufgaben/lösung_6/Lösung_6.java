package assoziationen.aufgaben.lösung_6;

/* Level 2
    Führen Sie bitte zunächst die drei folgenden Klassen ein:

        a) Klasse Land
            Member:
                Länderliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Land]
                Firmenliste (privat) [Liste aller Firmen, die im jeweiligen Land vertreten sind]
                Name des Landes (privat)
                Methode:
                    Name: zeigeAlleFirmen
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: "Alle Firmen in" + Ländername
                              - Alle Namen der Firmen aus Firmenliste
                    Rückgabewert: keiner
                Konstruktor:
                    Übergabewert: Name des Landes
                    Funktion: - Füllt das private Feld (Name des Landes)
                              - Fügt das Land zur Länderliste

        b) Klasse Firma
            Member:
                Firmaliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Firma]
                Länderliste (privat) [Liste aller Länder, in denen die Firma vertreten ist]
                Mitarbeiterliste (privat) [Liste aller Mitarbeiter, die in der Firma arbeiten]
                Name der Firma (privat)
                2 Methoden:
                    1.) Name: zeigeAlleLänder
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: Alle Länder in denen " + Name der Firma + " vertreten ist:"
                              - Alle Namen der Länder aus Länderliste
                    Rückgabewert: keiner
                    2.) Name: zeigeAlleMitarbeiter
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: Alle Mitarbeiter die in" + Name der Firma + " arbeiten:"
                              - Alle Namen der Mitarbeiter aus Mitarbeiterliste
                    Rückgabewert: keiner
                Konstruktor:
                    Übergabewert: Name der Firma
                    Funktion: - Füllt das private Feld (Name der Firma)
                              - Fügt die Firma zur Firmenliste

        c) Klasse Mitarbeiter
            Member:
                Mitarbeiterliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Mitarbeiter]
                Name des Mitarbeiters (privat)
                Firma (privat) [in der Mitarbeiter arbeitet]
                Konstruktor:
                    Übergabewert: Name des Mitarbeiters, Firma
                    Funktion: - Füllt das private Feld (Name des Mitarbeiters)
                              - Fügt den Mitarbeiter zur Mitarbeiterliste

     Im Main
        a) Instanziierung:
            Firmen: Microsoft, Apple, Volkswagen und Porsche
            Länder: Deutschland, USA, Dänemark
            Mitarbeiter: Mike, Marcy, Andrew, Amy, Volker, Verena, Paul und Petra
        b) Listen auffüllen:
            Microsoft und Volkswagen sind in allen drei Ländern vertreten.
            Apple und Porsche nur in Deutschland und USA.
            Jeder Mitarbeiter arbeitet in einer Firma, bei denen die Anfangsbuchstaben übereinstimmen.
        c) Navigierbarkeit (als Ergebnis der Klassenmember): Land<->Firma und Firma<->Mitarbeiter (alle Assoziationen sind bidirektional)

        Kontrollausgabe:
            1) Alle Firmen pro Land
            2) Alle Länder pro Firma
            3) Alle Mitarbeiter pro Firma
            4) Firma jedes Mitarbeiters

*/

import java.util.Scanner;

public class Lösung_6
{
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean istOk;
    private static String auswahl = null;
    private static String landName = null;
    private static String firmenName = null;


    public static void main(String[] args)
    {
        // a) Instanziierung:
        Firma f1 = new Firma("Microsoft");
        Firma f2 = new Firma("Apple");
        Firma f3 = new Firma("Volkswagen");
        Firma f4 = new Firma("Porsche");

        Land l1 = new Land("Deutschland");
        Land l2 = new Land("USA");
        Land l3 = new Land("Dänemark");

        Mitarbeiter m1 = new Mitarbeiter("Mike", f1);
        Mitarbeiter m2 = new Mitarbeiter("Marcy", f1);
        Mitarbeiter m3 = new Mitarbeiter("Andrew", f2);
        Mitarbeiter m4 = new Mitarbeiter("Amy", f2);
        Mitarbeiter m5 = new Mitarbeiter("Volker", f3);
        Mitarbeiter m6 = new Mitarbeiter("Verena", f3);
        Mitarbeiter m7 = new Mitarbeiter("Paul", f4);
        Mitarbeiter m8 = new Mitarbeiter("Petra", f4);

        // b) Listen auffüllen:

        f1.getLänder().add(l1);
        f1.getLänder().add(l2);
        f1.getLänder().add(l3);

        f2.getLänder().add(l1);
        f2.getLänder().add(l2);

        f3.getLänder().add(l1);
        f3.getLänder().add(l2);
        f3.getLänder().add(l3);

        f4.getLänder().add(l1);
        f4.getLänder().add(l2);

        l1.getFirmen().add(f1);
        l1.getFirmen().add(f2);
        l1.getFirmen().add(f3);
        l1.getFirmen().add(f4);

        l2.getFirmen().add(f1);
        l2.getFirmen().add(f2);
        l2.getFirmen().add(f3);
        l2.getFirmen().add(f4);

        l3.getFirmen().add(f1);
        l3.getFirmen().add(f3);

        f1.getMitarbeiter().add(m1);
        f1.getMitarbeiter().add(m2);
        f2.getMitarbeiter().add(m3);
        f2.getMitarbeiter().add(m4);
        f3.getMitarbeiter().add(m5);
        f3.getMitarbeiter().add(m6);
        f4.getMitarbeiter().add(m7);
        f4.getMitarbeiter().add(m8);

        // Menu als Kontrollausgabe:
        while(true)
            starteMenu();

    }

    public static void starteMenu()
    {
        System.out.println("\nHauptmenü");
        System.out.println("Bitte treffen Sie ihre Auswahl:");
        System.out.print("1 <- Alle Firmen pro Land\n2 <- Alle Länder pro Firma\n3 <- Alle Mitarbeiter pro Firma\n" +
                             "4 <- Firma jedes Mitarbeiters\n5 <- Programm beenden\n\nAuswahl: ");
        auswahl = scanner.nextLine();

        switch (auswahl)
        {
            case "1":
                auswahlAlleFirmenProLand(); // Methode für Auswahl Land und Anzeige der Firmen
                break;
            case "2":
                auswahlLänderProFirma(); // Methode für Auswahl Firma und Anzeige der Länder (Standorte)
                break;
            case "3":
                auswahlMitarbeiterProFirma(); // Methode für Auswahl der Firma und Anzeige ihrer Mitarbeiter
                break;
            case "4":
                auswahlFirmaJedesMitarbeiter(); // Methode für Anzeige aller Mitarbeiter jeder Firma
                break;
            case "5":
                System.exit(0); // Programm beendet
                break;

            default:
                System.out.println("Eingabe ist nicht bekannt!");
                break;
        }

    }

    public static void auswahlAlleFirmenProLand()
    {
        System.out.println("Bitte wählen Sie das Land von dem die Firmen angezeigt werden sollen!");
        int i = 1;
        for (Land l : Land.länder)
        {
            System.out.println(i + " <- " + l.getName());
            i++;
        }

        do
        {
            System.out.print("Auswahl: ");
            auswahl = scanner.nextLine();

            istOk = true;
            switch (auswahl)
            {
                case "1":
                    landName = "Deutschland";
                    break;
                case "2":
                    landName = "USA";
                    break;
                case "3":
                    landName = "Dänemark";
                    break;

                default:
                    System.out.println("Eingabe ist nicht bekannt!");
                    istOk = false;
                    break;
            }
        } while (!istOk);
        System.out.println("Alle Firmen von " + landName + ":");
        for (Land l : Land.länder)
        {

            if (l.getName().equals(landName))
            {
                for (Firma f : l.getFirmen())
                {
                    System.out.println(f.getName());
                }
            }
        }

        System.out.println("\n---Warte auf Tastendruck---");
        scanner.nextLine();
    }

    public static void auswahlLänderProFirma()
    {
        System.out.println("Bitte wählen Sie die Firma aus von der Sie die Länder angezeigt bekommen haben wollen!");
        int i = 1;
        for (Firma f : Firma.firmen)
        {
            System.out.println(i + " <- " + f.getName());
            i++;
        }

        do
        {
            System.out.print("Auswahl: ");
            auswahl = scanner.nextLine();

            istOk = true;
            switch (auswahl)
            {
                case "1":
                    firmenName = Firma.firmen.get(0).getName();
                    break;
                case "2":
                    firmenName = Firma.firmen.get(1).getName();
                    break;
                case "3":
                    firmenName = Firma.firmen.get(2).getName();
                    break;
                case "4":
                    firmenName = Firma.firmen.get(3).getName();
                    break;
                default:
                    System.out.println("Eingabe ist nicht bekannt!");
                    istOk = false;
                    break;
            }
        } while (!istOk);
        System.out.println("Alle Länder von " + firmenName + ":");
        for (Firma f : Firma.firmen)
        {

            if (f.getName().equals(firmenName))
            {
                for (Land l : f.getLänder())
                {
                    System.out.println(l.getName());
                }
            }
        }

        System.out.println("\n---Warte auf Tastendruck---");
        scanner.nextLine();
    }

    public static void auswahlMitarbeiterProFirma()
    {

        System.out.println("Bitte wählen Sie die Firma aus von der Sie alle Mitarbeiter angezeigt bekommen wollen!");
        int i = 1;
        for (Firma f : Firma.firmen)
        {
            System.out.println(i + " <- " + f.getName());
            i++;
        }

        do
        {
            System.out.print("Auswahl: ");
            auswahl = scanner.nextLine();

            istOk = true;
            switch (auswahl)
            {
                case "1":
                    firmenName = "Microsoft";
                    break;
                case "2":
                    firmenName = "Apple";
                    break;
                case "3":
                    firmenName = "Volkswagen";
                    break;
                case "4":
                    firmenName = "Porsche";
                    break;
                default:
                    System.out.println("Eingabe ist nicht bekannt!");
                    istOk = false;
                    break;
            }
        } while (!istOk);
        System.out.println("Alle Mitarbeiter der Firma " + firmenName + ":");
        for (Firma f : Firma.firmen)
        {

            if (f.getName().equals(firmenName))
            {
                for (Mitarbeiter m : f.getMitarbeiter())
                {
                    System.out.println(m.getName());
                }
            }
        }

        System.out.println("\n---Warte auf Tastendruck---");
        scanner.nextLine();
    }

    public static void auswahlFirmaJedesMitarbeiter()
    {
        System.out.println("Ausgabe aller Mitarbeiter und ihren Firmen: ");
        int i = 1;
        for (Mitarbeiter m : Mitarbeiter.mitarbeiter)
        {
            System.out.println(i + ".Mitarbeiter:\t" + m.getName() + "\n  Firma:\t\t" + m.getFirma().getName());
            i++;
        }

        System.out.println("\n---Warte auf Tastendruck---");
        scanner.nextLine();
    }

}



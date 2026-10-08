package assoziationen.aufgaben.lösung_1;

/* Level 2
    Führen Sie bitte zunächst die beiden folgenden Klassen ein:
       Fach (Attribute: id, bezeichnung)
       Klausur (Attribute: id, note)
    Erzeugen Sie bitte die beiden folgenden Objekte vom Typ Fach:
       Java-Grundlagen
       Datenbankmodellierung und SQL
       (wählen Sie beliebige ID)
    Erzeugen Sie bitte die drei folgenden Objekte vom Typ Klausur:
       2 Klausuren im Fach Java
       1 Klausur im Fach DBM+SQL
       (wählen Sie beliebige ID und Noten)

    Sorgen Sie bitte für eine BIDIREKTIONALE Navigierbarkeit
    (Dazu müssen Sie weitere Klassenmember einfügen)

    Schreiben Sie ferner bitte das folgende Programm im Main:
       In einer Endlos-Schleife wird pro Durchlauf ...
         - vom User abgefragt, ob er ...
           (1) von Klausur zum Fach navigieren, oder
           (2) von Fach zur Klausur navigieren möchte
           (Wiederholung der Abfrage, wenn weder 1, noch 2 gewählt wurde)
         - Falls 1 gewählt wurde, so wird vom User eine Klausur-ID abgefragt
             Falls die Eingabe einen Format-Fehler hat, wird die Abfrage wiederholt
             Falls die Eingabe vom Format OK, aber keine Klausur mit der gewählten ID existiert: Fehlermeldung + Wiederholung der Abfrage
             Falls Eingabe-Format OK UND ID existiert: Ausgabe der Fach-Bezeichnung
         - Falls 2 gewählt wurde, so wird vom User eine Fach-ID abgefragt
             Falls die Eingabe ein Format-Fehler, wird die Abfrage wiederholt
             Falls die Eingabe vom Format OK, aber kein Fach mit der gewählten ID existiert: Fehlermeldung + Wiederholung der Abfrage
             Falls Eingabe-Format OK UND ID existiert: Ausgabe aller Klausur-IDs und Noten der Klausuren zu diesem Fach
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Lösung_1
{

    public static void main(String[] args)
    {
        // Die beiden Listen:
        ArrayList<Fach> FächerListe = new ArrayList<Fach>(); // Die Listen könnten auch statisch in den jeweiligen Klassen
        // sein
        ArrayList<Klausur> KlausurenListe = new ArrayList<Klausur>();

        // 2 Fächer:
        Fach f1 = new Fach(1, "Java-Grundlagen");
        FächerListe.add(f1);

        Fach f2 = new Fach(2, "Datenbankmodellierung und SQL");
        FächerListe.add(f2);

        // 3 Klausuren:
        // k1 und k2 sind vom Fach f1:
        Klausur k1 = new Klausur(1, 1.3, f1);
        KlausurenListe.add(k1);

        Klausur k2 = new Klausur(2, 1.7, f1);
        KlausurenListe.add(k2);

        // k3 ist vom fach f2:
        Klausur k3 = new Klausur(3, 1.0, f2);
        KlausurenListe.add(k3);

        String eingabeText = "";
        int eingabeZahl;
        boolean gefunden = false;
        Klausur gewählteKlausur = null;
        Fach gewähltesFach = null;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            gewählteKlausur = null;
            gewähltesFach = null;

            System.out.print("Navigation Klausur->Fach(1)\nNavigation Fach->Klausur(2)\nAuswahl: ");
            eingabeText = sc.nextLine();

            switch (eingabeText)
            {
                case "1":
                    do
                    {
                        gefunden = false;
                        do
                        {
                            int i = 1;
                            for (Klausur k : KlausurenListe)
                            {
                                System.out.println(i + " <- ID:" + k.getId());
                                i++;
                            }
                            System.out.println("Geben Sie bitte die gewünschte Klausur-ID ein: ");
                            eingabeText = sc.nextLine();
                            try
                            {
                                eingabeZahl = Integer.parseInt(eingabeText);
                            }
                            catch (Exception ex)
                            {
                                eingabeZahl = -1;
                            }
                        } while (eingabeZahl == -1);

                        for (Klausur k : KlausurenListe)
                        {
                            if (k.getId() == eingabeZahl)
                            {
                                gefunden = true;
                                gewählteKlausur = k;
                                break;
                            }
                        }

                        if (!gefunden)
                        {
                            System.out.println("Es existiert keine Klausur mit dieser ID!");
                        }
                        else
                        {
                            System.out.printf("Die Klausur mit der ID= %d war im Fach: %s%n", gewählteKlausur.getId(), gewählteKlausur.getThema().getBezeichnung());
                        }
                    } while (!gefunden);
                    break;
                case "2":
                    do
                    {
                        gefunden = false;
                        do
                        {
                            int i = 1;
                            for (Fach f : FächerListe)
                            {
                                System.out.println(i + " <- ID:" + f.getId());
                                i++;
                            }
                            System.out.print("Geben Sie bitte die gewünschte Fach-ID ein: ");
                            eingabeText = sc.nextLine();
                            try
                            {
                                eingabeZahl = Integer.parseInt(eingabeText);
                            }
                            catch (Exception ex)
                            {
                                eingabeZahl = -1;
                            }
                        } while (eingabeZahl == -1);

                        for (Fach f : FächerListe)
                        {
                            if (f.getId() == eingabeZahl)
                            {
                                gefunden = true;
                                gewähltesFach = f;
                                break;
                            }
                        }

                        if (!gefunden)
                        {
                            System.out.println("Es existiert kein Fach mit dieser ID!");
                        }
                        else
                        {
                            System.out.printf("Liste aller Klausuren im Fach mit der ID= %d ( %s )%n", eingabeZahl, gewähltesFach.getBezeichnung());
                            for (Klausur k : gewähltesFach.getKlausuren())
                            {
                                System.out.println("ID der Klausur: " + k.getId() + " | Note: " + k.getNote());
                            }
                        }
                    } while (!gefunden);
                    break;
            }
        }
    }
}


package aufgaben.lösung_7;
/*
 Level 1
 */

public class Lösung_7
{
     /* Testen Sie bitte die obigen Definitionen an folgendem Programm im Main:
        - Instanziierung der Städte Dinslaken(70000) und Wuppertal(350000)
        - Instanziierung der Landeshauptstadt Düsseldorf(620000 / Platz des Landtags 1, 40221 Düsseldorf)
        - Für alle drei Städte: Ausgabe von Name und Eigenschaft(Großstadt "Stimmt!" oder "Nein!")
        - Für die Landeshauptstadt: Ausgabe der Adresse (des Landtages)               */

    public static void main(String[] args)
    {
        Stadt s1 = new Stadt(70000, "Dinslaken");
        Stadt s2 = new Stadt(350000, "Wuppertal");
        Landeshauptstadt l1 = new Landeshauptstadt(620000, "Düsseldorf", "Platz des Landtags 1, 40221 Düsseldorf");

        System.out.println(s1.getName() + " ist eine Großstadt? " + s1.istGroßstadt());
        System.out.println(s2.getName() + " ist eine Großstadt? " + s2.istGroßstadt());

        System.out.println(l1.getName() + " ist eine Großstadt? " + l1.istGroßstadt());
        System.out.println(l1.getAdresse());
    }
}

/*Führen Sie bitte die beiden folgenden Klassen ein:

Klasse Stadt
    Attribute: einwohnerzahl, name (alle private)
    Methoden: Get und Set für einwohnerzahl, Get für Name, istGroßstadt[String](Rückgabe: "Stimmt!", FALLS einwohnerzahl >= 100000, SONST "Nein!")
    Konstruktor:
        Übergabewerte: int e, String n
        Funktion:      setzt:
                       - einwohnerzahl=e
                       - name=n
*/

/*  Klasse Landeshauptstadt (SUBKLASSE von Stadt!)
    Attribute: adresse (des Landtages)
    Properties: Adresse(get und set)
    Konstruktor:
        Übergabewerte: String a UND die Attribute des Basis-Klassen-Konstruktors
        Funktion:      setzt adresse=a UND übergibt die entsprechenden Attribute an den Basis-Klassen-Konstruktor*/



import java.util.Arrays;
import java.util.Scanner;

public class Enum_Level1 {
  /* Level 1

    Schreiben Sie ein Programm, indem ein Benutzer über ein Menü zwischen drei Möglichkeiten auswählen kann.
    Die auswählbaren Möglichkeiten werden über ein Enum erfasst. Es sollen "JA", "NEIN" und "VIELLEICHT" auswählbar sein.

    In einem Switch-Case wird die Eingabe auf Übereinstimmung mit den Enum-Konstanten geprüft und der Benutzer erhält passend zu seiner Auswahl eine Ausgabe.
    Trifft der Benutzer eine ungültige Wahl, soll eine Fehlermeldung ausgegeben werden.

    Hinweis: Die Auswahlmöglichkeiten können per Schleife mithilfe der Methode values() des Enums ausgegeben werden. Mit valueOf() kann aus einem String eine Enum-Konstante gemacht werden.
 */
  public static void main(String... args){
    System.out.print("Wähle:");
    System.out.println(Arrays.toString(Antworten.values()));

    // Scanner der den Nutzer drei Möglichkeiten auswählen lässt
    Scanner scanner = new Scanner(System.in);
    String eingabe = scanner.nextLine();

    try {
      Antworten eingabeAntwort = Antworten.valueOf(eingabe);
      // Möglichkeit 2: Switch Case über eigene Funktion aufrufen
      pruefung(eingabeAntwort);
    } catch(IllegalArgumentException iae){
      System.out.println("Die Eingabe war fehlerhaft!");
    }
  }

  public static void pruefung(Antworten eingabeAntwort){
    // Switch-Case
    switch (eingabeAntwort){
      case Antworten.JA:
        System.out.println("Richtige Antwort!");
        break;
      case Antworten.NEIN:
        System.out.println("War nicht korrekt.");
        break;
      case Antworten.VIELLEICHT:
        System.out.println("Ehh fast.");
        break;
      default:
        System.out.println("Hilfe, alles läuft schief...");
        break;
    }
  }

}
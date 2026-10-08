package tag10;

import java.time.LocalDate;
import java.util.HashSet;

public class Programmiersprache {
    // Instanzvarable
    private String name;
    private LocalDate beginn;
    private int punkte;

    //Konstruktoren
    public Programmiersprache(String nameStart, LocalDate beginnStart, int punkteStart){
      name = nameStart;
      beginn = beginnStart;
      punkte = punkteStart;
    }

    // Klassenvariable

    // Instanzmethoden
    public void ausgabe(){
        // Ü: Auf konsole ausgaben
        System.out.printf ("Programmiersprache %s\n\t Beginn: %s\n\t punkte: %d %n", name, beginn, punkte);

    }
    public void  einenPunktMehr(){
        punkte++;

    }

    //Klassenmethoden
    static void main(String[] args) {
        Programmiersprache sprache1 = new Programmiersprache("Basic", LocalDate.of(2010,8,23),2);
        sprache1.ausgabe();

    // Ü: sprache2 Java
        Programmiersprache sprache2= new Programmiersprache("Java" , LocalDate.of(1995, 2, 14),4);
        sprache2.ausgabe();

        sprache2.einenPunktMehr();
        sprache2.ausgabe();

        Programmiersprache[] arr = {sprache1, sprache2};
        System.out.println("Länge: " + arr.length);

        HashSet<Programmiersprache> hashSet = new HashSet<>();
        hashSet.add(sprache1);
        hashSet.add(sprache2);
    }
}

package komposition.template;

public class Komposition
{
    public static void main(String[] args)
    {
        Gebäude schule = new Gebäude("Schule", 1, 2, 3, 4);
        schule.addRaum(5);
        schule.addRaum(6);

        // Würden wir die Referenz eines Raumes außerhalb des Gebäudes speichern, so würde dieser Raum nicht mit dem Gebäude gelöscht werden.
        //Gebäude.Raum r = schule.getRaumListe().get(0);

        // Dank privatem Konstruktor können wir hier keine Raum-Objekte außerhalb des Gebäudes erzeugen.
        //Gebäude.Raum raum = new Gebäude.Raum();

        System.out.println("Raumnummern des Gebäudes:");
        System.out.println(schule.getRäume());

        schule = null; // Referenz auf das Gebäude löschen.
        //r = null;
        System.gc(); // Garbage Collector aufrufen.

        System.out.println("Hier sollte das Gebäude und alle Räume gelöscht sein... hoffentlich");

        //System.out.println("Der Raum mit der Nummer " + r.getRaumNummer() + " bleibt erhalten.");

    }
}

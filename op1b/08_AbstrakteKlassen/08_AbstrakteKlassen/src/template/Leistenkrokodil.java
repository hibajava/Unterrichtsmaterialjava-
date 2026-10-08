package template;

// Wird von einer abstrakten Klasse mit abstrakten Methoden geerbt, ist man dazu gezwungen, diese abstrakten Methoden in der abgeleiteten Klasse zu überschreiben.
public class Leistenkrokodil extends Krokodil
{
    // Abstrakte Methoden MÜSSEN in der nicht-abstrakten Klasse überschrieben werden.
    @Override
    public void zeigeInfoZumLebensraum()
    {
        //super.getInfoZumLebensraum(); // Ein direkter Aufruf der abstrakten Methode ist nicht möglich!
        System.out.println("Ich lebe in Ostindien, Südostasien und komme sogar bis nach Nordaustralien.");
    }

    // Die Subklasse kann natürlich eigene Member besitzen:
    public void imSchlammLiegen()
    {
        System.out.println("Ich liege im Schlamm. Hier mag ich es.");
    }

    public Leistenkrokodil(String farbe)
    {
        // 'farbe' und 'alter' an protected Konstruktor der Superklasse weiterreichen.
        super(farbe);
    }

    public Leistenkrokodil()
    {
        this("keine Farbe");
    }

}

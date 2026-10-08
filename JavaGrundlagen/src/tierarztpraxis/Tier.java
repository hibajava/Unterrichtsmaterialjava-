package tierarztpraxis;

public class Tier
{
    //----(gemeinsame) Attribute---
    String tierart;
    String name;
    int alter;

    //----Verhalten/Methoden-----
    void bewegen()
    {
        System.out.println("Bewegen....");
    }

    void machGeraeusch()
    {
        System.out.println("Das Tier macht ein Geräusch");
    }
}

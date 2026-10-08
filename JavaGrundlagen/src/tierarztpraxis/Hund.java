package tierarztpraxis;

public class Hund extends Tier
{
    //----eigene Attribute----
    String rasse;

    //----Methoden----
    void spielen() {
        System.out.println("Der Hund spielt");
    }
    @Override
    void machGeraeusch()
    {
        System.out.println("Der Hund bellt");
    }
}

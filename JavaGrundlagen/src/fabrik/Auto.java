package fabrik;

public class Auto extends Fahrzeug
{
    //-----(eigene) Eigenschaften/Attribute----



    //-----eigne Methoden/eigenes Verhalten-------
    @Override
    public void fahren() {
        System.out.println("Das Fahrrad fährt.....");
    }
    void hupen()
    {
        System.out.println("Das Auto hupt....");
    }
}

package aufgaben.lösung_5;


class Server extends Computer
{
    public Server(String hersteller)
    {
        super(hersteller);
    }

    @Override
    public void einAusschalten()
    {
        super.einAusschalten();
        System.out.printf("Server wurde %sgeschaltet.%n", istEingeschaltet ? "ein" : "aus");
    }

}

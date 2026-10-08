package aufgaben.lösung_5;


class Desktop extends Computer
{
    public Desktop(String hersteller)
    {
        super(hersteller);
    }

    @Override
    public void einAusschalten()
    {
        super.einAusschalten();
        System.out.printf("Desktop wurde %sgeschaltet.%n", istEingeschaltet ? "ein" : "aus");
    }
}

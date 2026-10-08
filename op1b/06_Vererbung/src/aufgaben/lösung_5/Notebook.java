package aufgaben.lösung_5;


class Notebook extends Computer
{
    public Notebook(String hersteller)
    {
        super(hersteller);
    }

    @Override
    public void einAusschalten()
    {
        super.einAusschalten();
        System.out.printf("Notebook wurde %sgeschaltet.%n", istEingeschaltet ? "ein" : "aus");
    }
}

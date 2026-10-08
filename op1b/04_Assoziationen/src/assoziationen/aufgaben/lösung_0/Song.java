package assoziationen.aufgaben.lösung_0;

class Song
{
    private String titel;
    private Interpret interpret;

    public Song(String titel, Interpret interpret)
    {
        this.titel = titel;
        this.interpret = interpret;

        interpret.getSongs().add(this);
    }

    public String getTitel()
    {
        return titel;
    }

    public Interpret getInterpret()
    {
        return interpret;
    }
}

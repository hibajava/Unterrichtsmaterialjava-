package aufgaben.lösung_2;

import java.time.Duration;

class Song extends Object
{
    private String titel;

    private int dauerSekunden;

    private String interpret;

    @Override
    public String toString()
    {
        Duration duration = Duration.ofSeconds(dauerSekunden);

        return String.format("Titel: %s - Interpret: %s - Dauer:  %02d:%02d", titel, interpret, duration.toMinutes(), duration.getSeconds() % 60);
    }

    public Song(String titel, int dauerSekunden, String interpret)
    {
        this.titel = titel;
        this.dauerSekunden = dauerSekunden;
        this.interpret = interpret;
    }
}

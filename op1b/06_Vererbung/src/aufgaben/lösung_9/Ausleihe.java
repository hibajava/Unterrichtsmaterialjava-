package aufgaben.lösung_9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Ausleihe
{
    /**
     * In dieser Liste sind die aktuell ausgeliehenen Videos mit Kunde und Datum gespeichert.
     */
    public static final List<Ausleihe> ausleiheListe = new ArrayList<Ausleihe>();

    /**
     * In dieser Liste sind die bereits wieder zurückgegebenen Videos mit Kunde und Datum gespeichert.
     */
    public static final List<Ausleihe> zurückgebrachtListe = new ArrayList<Ausleihe>();

    private final Video video;

    private final Kunde kunde;

    private final LocalDateTime datumAusgeliehen;

    private LocalDateTime datumZurückgebracht;

    /**
     * Konstruktor
     */
    private Ausleihe(Video video, Kunde kunde, LocalDateTime datumAusgeliehen)
    {
        this.video = video;
        this.kunde = kunde;
        this.datumAusgeliehen = datumAusgeliehen;

        ausleiheListe.add(this);
    }

    /**
     * ausleihen-Methode, wirft eine VideoException, wenn das übergebene Video bereits ausgeliehen ist.
     *
     * @return Ausleihe-Objekt
     * @throws VideoException Wenn Video bereits ausgeliehen
     */
    public static Ausleihe ausleihen(Video video, Kunde kunde) throws VideoException
    {
        // Find() sucht in der ausleiheListe nach einer Ausleihe, wo das gespeicherte Video dem gesuchten Video entspricht. Return ist die Ausleihe oder null, wenn nichts gefunden wurde
        Ausleihe ausleihe = null;
        for (Ausleihe a : ausleiheListe)
            if (a.video.equals(video))
            {
                ausleihe = a;
                break;
            }

        // Wenn ein Video gefunden wurde, dann ist das Video bereits ausgeliehen und Find() gibt uns ein Ausleihe-Objekt zurück
        if (ausleihe != null) // Haben wir ein Ausleihe-Objekt zurück bekommen...
            throw new VideoException("Video bereits ausgeliehen!", video); // Wird eine Exception geworfen

        else // Sonst können wir eine neue Ausleihe mit dem übergebenen Video und Kunden erzeugen
            ausleihe = new Ausleihe(video, kunde, LocalDateTime.now());

        return ausleihe;
    }

    /**
     * zurückgeben-Methode
     *
     * @return Ausleihe-Objekt, wenn erfolgreich, sonst null
     */
    public static Ausleihe zurückgeben(Video video)
    {
        Ausleihe ausleihe = null;
        for (Ausleihe a : ausleiheListe)
            if (a.video.equals(video))
            {
                ausleihe = a;
                break;
            }

        if (ausleihe != null) // Wenn Video gefunden wurde...
        {
            ausleiheListe.remove(ausleihe); // entfernen wir das Ausleihe-Objekt aus der ausleiheListe...
            zurückgebrachtListe.add(ausleihe); // und fügen es der Zurückgebracht-Liste hinzu.
            ausleihe.datumZurückgebracht = LocalDateTime.now();
        }
        return ausleihe;
    }

    /**
     * Gibt einen String bestehend aus allen Informationen des Ausleihe-Objektes zurück.
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Video: ").append(video.toString()).append("\n");
        sb.append("Kunde: ").append(kunde.toString()).append("\n");

        sb.append("Ausgeliehen am: ").append(datumAusgeliehen.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))).append("\n");

        if (datumZurückgebracht == null)
            sb.append("Noch nicht zurückgebracht.");
        else
            sb.append("Zurückgebracht am: ").append(datumZurückgebracht.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        return sb.toString();
    }
}

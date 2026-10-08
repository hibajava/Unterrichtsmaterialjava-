package aufgaben.lösung_9v2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Ausleihe
{
    public static final ArrayList<Ausleihe> ausleiheListe = new ArrayList<>();
    private final Kunde kunde;
    private final Video video;
    private final LocalDateTime ausgeliehenAm;
    private LocalDateTime zurückgebrachtAm;

    public Kunde getKunde()
    {
        return kunde;
    }

    public Video getVideo()
    {
        return video;
    }

    public LocalDateTime getAusgeliehenAm()
    {
        return ausgeliehenAm;
    }

    public LocalDateTime getZurückgebrachtAm()
    {
        return zurückgebrachtAm;
    }

    public void setZurückgebrachtAm(LocalDateTime zurückgebrachtAm)
    {
        this.zurückgebrachtAm = zurückgebrachtAm;
    }

    public Ausleihe(Kunde kunde, Video video, LocalDateTime ausgeliehenAm, LocalDateTime zurückgebrachtAm)
    {
        this.kunde = kunde;
        this.video = video;
        this.ausgeliehenAm = ausgeliehenAm;
        this.zurückgebrachtAm = zurückgebrachtAm;

        ausleiheListe.add(this);
    }

    public static Ausleihe ausleihen(Kunde kunde, Video video) throws VideoException
    {
        // Prüfen, ob das Video bereits ausgeliehen ist:
        if (video.isAusgeliehen())
            throw new VideoException("Video bereits ausgeliehen!", video);

        Ausleihe ausleihe = new Ausleihe(kunde, video, LocalDateTime.now(), null);
        video.setAusgeliehen(true); // Wir müssen den Wert im Video auf true setzen, wenn wir das Video ausleihen.

        return ausleihe;
    }

    public static Ausleihe sucheAusleihe(Kunde kunde, Video video) throws VideoException
    {
        for (Ausleihe a : ausleiheListe)
        {
            if (a.kunde == kunde && a.video == video && a.zurückgebrachtAm == null)
                return a;
        }

        // In realen Programmen versuche ich immer, Exceptions zu vermeiden und verwende Exceptions nur, wenn es keine andere Möglichkeit gibt.
        // Hier verwenden wir diese Exceptions zur Übung.
        throw new VideoException("Kunde hat das Video bereits zurückgebracht!", video);
    }

    public void zurückbringen()
    {
        setZurückgebrachtAm(LocalDateTime.now());
        video.setAusgeliehen(false);
    }

    @Override
    public String toString()
    {
        return "Ausleihe{" +
            "kunde=" + kunde +
            ", video=" + video +
            ", ausgeliehenAm=" + ausgeliehenAm.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")) +
            ", zurückgebrachtAm=" + zurückgebrachtAm +
            '}';
    }
}

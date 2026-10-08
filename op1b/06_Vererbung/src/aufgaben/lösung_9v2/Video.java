package aufgaben.lösung_9v2;

import java.util.ArrayList;

class Video
{
    public static final ArrayList<Video> videoListe = new ArrayList<>();

    private final String titel;
    private boolean ausgeliehen;

    public String getTitel()
    {
        return titel;
    }

    public boolean isAusgeliehen()
    {
        return ausgeliehen;
    }

    public void setAusgeliehen(boolean ausgeliehen)
    {
        this.ausgeliehen = ausgeliehen;
    }

    public Video(String titel, boolean ausgeliehen)
    {
        this.titel = titel;
        this.ausgeliehen = ausgeliehen;

        videoListe.add(this);
    }

    @Override
    public String toString()
    {
        return "Video{" +
            "titel='" + titel + '\'' +
            ", ausgeliehen=" + ausgeliehen +
            '}';
    }
}

package aufgaben.lösung_9;

import java.util.ArrayList;
import java.util.List;

class Video
{
    public static final List<Video> videoListe = new ArrayList<Video>();

    private final String titel;

    public Video(String titel)
    {
        this.titel = titel;
        videoListe.add(this);
    }

    @Override
    public String toString()
    {
        return titel;
    }

}

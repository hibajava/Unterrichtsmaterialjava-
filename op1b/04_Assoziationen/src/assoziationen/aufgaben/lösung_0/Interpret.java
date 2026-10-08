package assoziationen.aufgaben.lösung_0;

import java.util.ArrayList;
import java.util.List;

class Interpret
{
    private String name;
    private final List<Song> songs = new ArrayList<Song>();

    public Interpret(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public List<Song> getSongs()
    {
        return songs;
    }
}

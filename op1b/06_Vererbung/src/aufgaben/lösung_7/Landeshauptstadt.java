package aufgaben.lösung_7;

class Landeshauptstadt extends Stadt
{
    private String adresse;

    public String getAdresse()
    {
        return adresse;
    }

    public Landeshauptstadt(int e, String n, String a)
    {
        super(e, n);
        adresse = a;
    }
}

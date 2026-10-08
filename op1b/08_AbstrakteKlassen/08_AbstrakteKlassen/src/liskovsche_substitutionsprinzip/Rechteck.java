package liskovsche_substitutionsprinzip;

// Basisklasse fürs Prinzip
public class Rechteck {
    // -----------
    // |         |
    // |         |
    // -----------
    protected int breite;
    protected int laenge;

    public Rechteck(int breite, int laenge){
        this.breite = breite;
        this.laenge = laenge;
    }

    public void setBreite(int breite){
        if(breite >= 0){
            this.breite = breite;
        }
    }

    public void setLaenge(int laenge){
        if(laenge >= 0){
            this.laenge = laenge;
        }
    }

    public int getFlaeche(){
        return breite * laenge;
    }

}

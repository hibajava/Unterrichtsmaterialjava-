public class Nilkrokodil extends Krokodil{

    public Nilkrokodil(String farbe) {
        super(farbe);
    }

    public void imGrasLiegen(){
        System.out.println("## Ich liege im Gras und gucke die Sonne an ##");
    }

    @Override
    public void zeigeInfoZumLebensraum() {
        System.out.println("Das Nilkrokodil lebt in der Subsahara-Afrika und Madagaskar in Flüssen und Seen.");
    }
}

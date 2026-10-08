package aggregation;

/* Level 1
 Schreiben Sie bitte ein Java-Programm, in dem ...
 - eine Klasse 'Produkt' definiert wird
   + Klassenmember sind:
     - name (String, private)
        + normaler Getter und Setter
     - mindestpreis (Integer, private)
        + kein Getter, normaler Setter
     - verkaufspreis (Integer, private)
        + normaler Getter; Setter: nur FALLS value>=mindestpreis SONST verkaufspreis=mindestpreis
 - im Main alle obigen "Feature" getestet werden
 - Unterschied zwischen static und nicht-static Methoden herausstellen
*/
public class Produkt {
    private static double mehrwertsteuer = 0.19; // 19% Mehrwertsteuer

    // Attribute
    private String name;
    private Integer mindestpreis;
    private int verkaufspreis;

    // Konstruktoren
    public Produkt(String name, Integer mindestpreis, int verkaufspreis){
        this.name = name;
        this.mindestpreis = mindestpreis;
        this.verkaufspreis = verkaufspreis;
    }

    // Getter und Setter
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMindestpreis(Integer neuerPreis){
        this.mindestpreis = neuerPreis;
    }

    public int getVerkaufspreis(){
        return verkaufspreis;
    }

    public double getVerkaufspreisInklMehrwertsteuer(){
        return verkaufspreis * (1 + mehrwertsteuer);
    }

    // Setter: nur FALLS value>=mindestpreis
    // SONST verkaufspreis=mindestpreis
    public void setVerkaufspreis(int value){
        if(value >= mindestpreis){
            this.verkaufspreis = value;
        } else {
            this.verkaufspreis = mindestpreis;
        }
    }

    // Überschreibt: Object object = new Object();
    @Override
    public String toString(){
        return "Produkt [ name: " + name +
                ", mindestpreis: " + mindestpreis +
                ", verkaufspreis: "+ verkaufspreis + "]";
    }

    // Unterschied zwischen static und nicht-static Methoden
    // Static Methoden:
    // Falls eine neue Steuerreform kommt:
    public static void setMehrwertsteuer(double neueMehrwertsteuer){
        mehrwertsteuer = neueMehrwertsteuer;
    }

}

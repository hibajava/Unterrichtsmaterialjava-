public enum Monat {
    // Monat beschrieben als NAME_DES_MONATS ( Wert_des_Monats, Quartal_des_Monats )
    JANUAR(1, 1),
    MÄRZ(3, 1),
    FEBRUAR(2, 1),
    APRIL(4, 2),
    MAI(5, 2),
    SEPTEMBER(9, 3),
    JUNI(6, 2),
    DEZEMBER(12, 4),
    JULI(7, 3),
    AUGUST(8, 3),
    OKTOBER(10, 4),
    NOVEMBER(11, 4);

    // Ein Feld welches den Wert des Monats als Zahl abspeichert
    private final int zahl;
    // Ein Feld welches das Quartal des Monats als Zahl abspeichert
    private final int quartal;

    // Konstruktor des Enums, dieser kann privat sein, da wir ihn nie außerhalb brauchen
    // Die Parameter müssen nicht genau so heißen, wie die Felder des Enums
    private Monat(int z, int q){
        //System.out.println("Wird genau einmal für jede Konstante aufgerufen, wenn das Enum das erste Mal genutzt wird.");
        this.zahl = z;
        this.quartal = q;
        //System.out.println(this.name() + " : " + this.zahl + " : " + this.quartal);
    }

    // Getter für die Zahl des Monats
    public int getZahl(){
        return zahl;
    }

    public int getQuartal(){
        return quartal;
    }

    public static void gehoertZumGleichenQuartal(Monat a, Monat b){
        if(a.quartal == b.quartal){
            System.out.println(a + " und " + b + " gehoeren zum gleichen Quartal " + a.quartal + ".");
        }
        else{
            System.out.println(a + " und " + b + " gehoeren nicht zum gleichen Quartal.");
            System.out.println(a + " gehört zu dem Quartal " + a.quartal);
            System.out.println(b + " gehört zu dem Quartal " + b.quartal);
        }
    }

    public static Monat gibMirDenMonatFuer(int zahl){
        for(Monat m : Monat.values()){
            if(m.zahl == zahl){
                return m;
            }
        }
        return null;
    }

    public void ausgabe(){
        System.out.println("Monat: " + this.name() + " - " + this.zahl);
    }


}

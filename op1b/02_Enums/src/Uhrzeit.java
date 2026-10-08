public enum Uhrzeit {
    ACHT(8), EINS(1), NEUN(9), DREI(3), VIER(4), FÜNF(5), SECHS(6),
    SIEBEN(7), ZEHN(10), ZWEI(2), ELF(11), ZWÖLF(12), MITTERNACHT(0);

    // Variable, die den Wert unserer Konstanten speichert
    // Diese muss final sein - unveränderlich
    private final int ausgewaehlteUhrzeit;

    // Konstruktor für unser Enum, damit wir die Ordinale angeben können
    // für die Konstanten
    private Uhrzeit(int ausgewaehlteUhrzeit) {
        this.ausgewaehlteUhrzeit = ausgewaehlteUhrzeit;
    }

    // Der Wert ausgewaehlteUhrzeit ist private,
    // also lassen wir uns die durch eine Getter ausgeben:

    public String getUhrzeit(){
        return ausgewaehlteUhrzeit + " Uhr";
    }

    public int getZahlenwert(){
        return ausgewaehlteUhrzeit;
    }

    // Testet ob eine bestimmte Zahl auch eine Uhrzeit ist
    // Gehört zur Klasse und NICHT zur Instanz einer Klasse
    // Sie kann ohne Instanz aufgerufen werden - unabhängig
    public static boolean istUhrzeit(int zahl){
        // .values ist static und gibt die Konstanten des Enums zurück
        for(Uhrzeit vergleichsZeit : Uhrzeit.values()){
            // Prüfen, ob die übergebene Zahl mit einem Wert
            // aus unseren Uhrzeiten übereinstimmt
            // Hier können wir DIREKT auf das private Attribut ausgewaehlteUhrzeit zugreifen
            if(vergleichsZeit.ausgewaehlteUhrzeit == zahl){
                return true;
            }
        }
        // Finden wir die übergebene Zahl nicht, geben wir false zurück
        return false;
    }

    // Wird in der Main aufgerufen mit "zehn" in Zeile 21
    public static boolean istUhrzeit(String zahl){
        // Auch hier holen wir uns alle Werte für Uhrzeit raus:
        // [ACHT, EINS, NEUN, DREI, VIER, FÜNF, SECHS, SIEBEN, ZEHN, ZWEI, ELF, ZWÖLF, MITTERNACHT]
        for(Uhrzeit vergleichsZeit : Uhrzeit.values()) {
            // Im ersten Durchlauf:
            // vergleichsZeit = Uhrzeit.ACHT
            String konstantenName = vergleichsZeit.name();
            // konstantenName = ACHT
            // equalsIgnoreCase "ist gleich und ignoriere Großschreibung"
            // ACHT = (wenn ich Großschreibung Ignoriere) "zehn"
            if(konstantenName.equalsIgnoreCase(zahl)){
                return true;
            }
            // acht != zehn -> Gehe eins weiter in der Schleife
        }
        return false;
    }
}

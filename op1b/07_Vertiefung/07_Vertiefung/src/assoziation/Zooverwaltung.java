package assoziation;

public class Zooverwaltung {
    public static void main(String[] args){
        // Assoziation von Tier zu Tierpfleger

        Tier affe = new Tier("Affe");
        Tier pferd = new Tier("Pferd");
        Tier jaguar = new Tier("Jaguar");

        Tierpfleger hans = new Tierpfleger(1, "Hans");
        Tierpfleger birgit = new Tierpfleger(2, "Birgit");

        // Multiplizität ansehen:
        // Ein Tier kann von mehreren Tierpflegern gepflegt werden
        hans.tierZurPflegeHinzufuegen(affe);
        birgit.tierZurPflegeHinzufuegen(affe);
        // Ein Tierpfleger kann mehrere Tiere pflegen
        birgit.tierZurPflegeHinzufuegen(pferd);
        birgit.tierZurPflegeHinzufuegen(jaguar);

        // Richtung der Assoziation ansehen:
        // Hier ist wichtig: Navigierbarkeit!
        // Wir navigieren vom Tierpfleger --> zum Tier
        // Wir können vom Tierpfleger auf eine Liste von Tieren zugreifen.
        // Das Tier hat keinen Zugriff auf den Tierpfleger.
    }
}

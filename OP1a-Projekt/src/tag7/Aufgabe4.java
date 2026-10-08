package tag7;

public class Aufgabe4 {
    static void main(String[] args) {
        // switch- Expression
        int nr = (int) (Math.random()*7 + 1); // 1bis 7
        String wochentag = switch (nr) {
            case 1 -> "Montag";
            case 2 -> "Dienstag";
            case 3 -> "Mittwoche ";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samatag";
            case 7 -> "Sonntag";
            default ->  "Unbekannt";

        };
        System.out.printf("tag %d: %s",nr , wochentag);
    }
}

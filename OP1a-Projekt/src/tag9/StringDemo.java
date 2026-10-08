package tag9;

public class StringDemo {
    public static void main(String[] args) {
        // Nützliche String Methoden
        String s1 = "Java";
        String s2 = "java";

        // Vergleiche
        boolean b = s1.equals(s2); // testet auf inhaltliche Gleichheit
        System.out.println("Inhaltlich gleich: " + b);

        b = s1.equalsIgnoreCase(s2);
        System.out.println("Gleich bis auf Klein/Großschreibung: " + b);

        System.out.println("Nur Großbuchstaben: " + s1.toUpperCase());
        System.out.println("Nur Kleinbuchstaben: " + s1.toLowerCase());

        // Teilstrings
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1, 3)); // oben exklusiv

        // Zugriff auf Buchstaben
        System.out.println(s1.charAt(2));
    }
}

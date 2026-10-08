package methoden;
public class Willkommen
{
    //Das ist die Main-Methode
    public static void main(String[] args)
    {
        System.out.println("Nun wird ein Unterprogramm/eine Methode (mehrmals) aufgerufen:");

        System.out.println();

        begruesse("Anna", 25);
        begruesse("Bob", 27);
        begruesse("Max", 80);

        System.out.println();

        System.out.println("Nun befinden wir uns wieder im Hauptprogramm");
    }

    //Dies ist eine eigene Methode
    public static void begruesse(String name, int alter)  //Methode mit (einem) Parameter
    {
        System.out.println("Hallo " + name);
        System.out.printf("%s ist %d Jahre alt%n", name, alter);
    }
}


package unternehmen;

public class Main
{
    public static void main(String[] args)
    {
        Mitarbeiter[] truppe= new Mitarbeiter[3];

        Mitarbeiter Manager = new Manager();
        Mitarbeiter Programierer = new Programmiere();
        Mitarbeiter Praktikant = new Praktikant();

        //Das Array belegt
        truppe[0]=Manager;
        truppe[1]=Programierer;
        truppe[2]= Praktikant;

        //----Alternative----
        //Mitarbeiter[] gruppe= {new Manager(), new Programmierer(), new Praktikant()}
        double summe = 0;

        for(Mitarbeiter x: truppe)
        {
            System.out.println(x.getClass().getSimpleName());
            System.out.println("Das Gehalt = "+x.berechneGehalt());
            summe += x.berechneGehalt();//polymorpher Aufruf
            System.out.println();

        }
        System.out.println("Gesamte Gehälter = %.2f, summe");
        }
    }
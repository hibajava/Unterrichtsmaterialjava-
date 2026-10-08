package schleifen;
import java.util.Scanner;
public class Beispiel2
{
    public static void main(String[] args)
    {
        Scanner eingabe = new Scanner(System.in);

        System.out.println("gib bitte ein zahl x : ");
        int x= eingabe.nextInt();

    while (x>1)
    {
       x= x/2;
        System.out.println("x= " + x);
    }
        System.out.println("Schleife wurde abgearbeitet");
    eingabe.close();
    }
}

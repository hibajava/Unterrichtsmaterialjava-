package verzweigungen;
import java.util.Scanner;
public class Notenberechnung {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wie heißt du?");
        String name = sc.nextLine();
        System.out.println("Gib deine letzten 3 Noten ein: ");
        double n1 = sc.nextDouble();
       double n2 = sc.nextDouble();
       double n3 = sc.nextDouble();
       double d= (n1+n2+n3)/3;

        System.out.printf("d = : %.2f%n" ,d);
        d = sc.nextDouble();
        if(d>=4.0)
        {
            System.out.println("bestanden:");
        }
        else {
            System.out.println("nicht bestanden");
        }
        sc.close();
    }
}
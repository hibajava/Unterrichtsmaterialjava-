
package verzweigungen;

import java.util.Scanner;

public class Volljaehrigkeit
{
    //Hauptprogramm
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Wie alt bist du?");
        int alter = input.nextInt();

        if(alter >= 18)
        {
            System.out.println("Du geltest in Deutschland als volljährig");
        }
        else
        {
            System.out.println("Du geltest in Deutschland noch nicht als volljährig");
        }

        input.close();
    }
}

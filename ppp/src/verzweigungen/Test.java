package verzweigungen;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        int alter;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Geben Sie bitte ihr alter?");
        alter = sc.nextInt();

        if( alter> 17)
        {
            System.out.println("In Deutschland gelten Sie als volljärig");
        }
        else
        {
            System.out.println("In Deutschland gelten Sie noch nicht als volljährig");
        }
        sc.close();
    }
}
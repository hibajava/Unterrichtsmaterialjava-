package for_schleife;

public class Beispieleaufgabe
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++)
        {

            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.print("\tfizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.print("\tFizz");
            }
            else if (i % 5 == 0)
            {
                System.out.print("\tBuzz");

            }
            else
            {
                System.out.print(i);
            }

        }

    }}
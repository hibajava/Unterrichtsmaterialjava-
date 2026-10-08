package arrays;

public class Umgekehrter
{
    public static void main(String[] args)
    {
        int[] zahlen = {1, 2, 3, 4, 5};

        //Die normale Reihenfolge:
        for(int i = 0; i <= zahlen.length - 1; i++)
        {
            System.out.printf("%d ", zahlen[i]);
        }

        System.out.println();

        //Die Umgekehrte:
        for(int i = zahlen.length - 1; i >= 0; i--)
        {
            System.out.printf("%d ", zahlen[i]);
        }
    }
}
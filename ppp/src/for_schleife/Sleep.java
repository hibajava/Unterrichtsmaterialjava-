package for_schleife;

import static java.lang.Thread.sleep;

public class Sleep
{
    public static void main(String[] args) throws InterruptedException
    {
        while(true)
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                sleep(500);
            }
            for (int j = 10; j >= 1; j--) {
                System.out.println(j);
                sleep(500);
            }
        }

    }
}
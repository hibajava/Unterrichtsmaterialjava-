package for_schleife;

import static java.lang.Thread.sleep;

public class Aufgabe_02_02_04
{
    public static void main(String[] args) throws InterruptedException
    {
//        while(true)
//        {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            sleep(500);
//        }
//        for (int i = 1; i >= 1; i--) {
//            System.out.println(i);
//            sleep(500);
//        }
//    }
        int sprung = 1;

        for(int i = 1;  ; i= i + sprung)
        {

            System.out.println(i);
            sleep(500);
            if(i== 10)
            {
               sprung = -1;
            }
            else if (i==1)
            {
              sprung =1;
            }
        }
    }
}
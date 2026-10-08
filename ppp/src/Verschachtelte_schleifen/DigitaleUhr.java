package Verschachtelte_schleifen;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class DigitaleUhr
    {
        public static void main(String[] args) throws InterruptedException
        {
            Scanner input = new Scanner(System.in);

            int stunde, minute, sekunde = 0;
            System.out.println("Bitte die aktuelle Uhrzeit eingeben Stunde & Minute:");

            System.out.print("Stunde: ");
            stunde = input.nextInt();

            System.out.print("Minute: ");
            minute = input.nextInt();

            while(true)
            {
                for(; stunde < 24; stunde++)
                {
                    for(; minute < 60; minute++)
                    {
                        for(sekunde = 0; sekunde < 60; sekunde++)
                        {
                            System.out.printf("%02d:%02d:%02d", stunde, minute, sekunde);
                            sleep(300);
                            System.out.print("\b".repeat(8));
                        }
                        //sekunde = 0;
                    }
                    minute = 0;
                }
                stunde = 0;
            }
        }
    }



package tag7;

import java.util.Random;

/*In einer Schleife eine Variable stunde mit Zufallswerten von 0-23 belegen.
Dann jeweils in Abhängigkeit des Wertes einen Gruß ausgeben:
0-6: Gute Nacht
7-11: Guten Morgen
12-17: Guten Tag
18-23: Guten Abend*/
public class Aufgabe3 {
    static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            int stunde = (int)(Math.random() * 24.0);
            System.out.print("stunde = " + stunde + ": ");
            greetingIfElse(stunde);
            greetingSwitch(stunde);
        }

    }

    private static void greetingSwitch(int stunde) {
        // switch -Statement
        switch (stunde ){// switch mit ganzezahligen Typen, Strings, Enums
            case 0, 1, 2, 3, 4, 5, 6:
                System.out.println("Gute Nacht");
                break;
            case 7, 8, 9, 10, 11:
                System.out.println("Guten Morgen");
                break;
            case 12, 13, 14, 15, 16, 17:
                System.out.println("Guten Tag");
                break;
            case  18, 19, 20, 21, 22, 23:
                System.out.println("Guten Abend");
                break;
            default:
                System.out.println("Sollen nicht vorkommen");

        }
    }

    private static void greetingIfElse(int stunde) {
        if (stunde >= 0 && stunde <= 6) {
            System.out.println("Gute Nacht ");
        } else if (stunde >= 7 && stunde <= 11) {
            System.out.println("Gute Morgen ");
        } else if (stunde >= 12 && stunde <= 17) {
            System.out.println("Gute Tag ");
        }else if (stunde >= 18 && stunde <= 23) {
                System.out.println("Gute Abend ");
            }

        }
    }

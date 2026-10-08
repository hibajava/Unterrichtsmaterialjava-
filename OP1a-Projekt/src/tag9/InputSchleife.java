package tag9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSchleife {
    static void main(String[] args) {

        double d = readDoubleFromConsole();
        System.out.println("d = " + d);
    }

    private static double readDoubleFromConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(" Eingabe double: ");
                String input = scanner.nextLine();
                try {
                    double d = Double.parseDouble(input);
                    return d;

                } catch (Exception e) {
                    System.out.println("Ungültiger Input: " + input);
                }

            }
        }
    }}

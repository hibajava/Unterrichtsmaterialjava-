package tag9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {
    static void main(String[] args) {
      // try- with-resources: scanner wird automatisch geschlossen 
        // Resources: scanner, Dateien , ID-streams
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Eingabe gnnze Zahl: ");
            int zahl = scanner.nextInt();
            System.out.println("zahl = " + zahl);
        }catch(InputMismatchException e) {
            System.out.println("Ungültiger Input");
        }
    }

    }

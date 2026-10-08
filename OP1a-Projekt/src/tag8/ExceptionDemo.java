package tag8;
/*
wenn etwas Unzulässiges geschieht, wird eine Exception ausgelöst, und stanarmäßig
stürzt das Programm ab.
Exceptionobjekt enthält Informationen zum Problem

Schlüsselwörter:
try damit schließt man potentiell gefährichen code ein
catch man fängt eine exception, Programm stürzt nicht ab
throw man löst Exception aus
throw kopfzeile einer Methode dokumentiert mögliche Exception
finally abschließender Block in Method, wird immer ausgeführt
 */
public class ExceptionDemo {
    static void main(String[] args) {
        //tryCatchDemo();
       // severalExceptionsDemo();
        //baseExceptionDemo();
        finallyDemo();

    }

    private static void finallyDemo() {
        try{
            int n = 0;
            if(Math.random()< 0.5) n = 2;
            
            int erg = 5 / n;
            System.out.println("erg = " + erg);
        }catch(Exception e){
            System.out.println("Exception");
            return; // finally wird noch ausgeführt
        }finally {
            System.out.println("Text im finally-Block");
        }
    }

    private static void baseExceptionDemo() {
    try{
        // int n = 5/0;
        String s = null; // undefiniert
        s = s.toUpperCase();
    }catch (Exception e) {// Variablenname ist pflicht hier
        System.out.println(e.getMessage());
    }
        System.out.println("Danach");
    }
    private static void severalExceptionsDemo() {
        try{
           // int n = 5/0;
            String s = null; // undefiniert
            s = s.toUpperCase();
        }catch (ArithmeticException e){// Variablenname ist pflicht hier
            System.out.println("Problem bei Divisuin");

        }catch (NullPointerException e){
            System.out.println("Problem bei null");

        }
        System.out.println("Danach");
    }

    private static void tryCatchDemo(){
        System.out.println("Division mit 0");
        try{
            int n = 4/0;
            System.out.println("in try-Block: Nach Division mit 0");
        } catch(ArithmeticException e){// Variablenname ist pflicht hier
           // e.printStackTrace(); Reihenfolge der Methodenaufrufe an dieser Stelle
            System.out.println("Problem: " + e.getMessage());
        }
        System.out.println("Nach catch-Block");
    }
}

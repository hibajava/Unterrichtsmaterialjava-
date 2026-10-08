package tag8;
/*

Recherchieren: Was sind Checked Exceptions in Java?
Wie verbreitet sind sie? Beispiele.  Methode soll eine solche Exception auslösen.
 */
public class Aufgabe3 {
    static void main(String[] args) {
        // CheckedException: Alle, die nicht von RuntimeException abgeleitet sind
        // Am häufigsten: I0Exception, auch Exception
        // Stammt aus Anfangszeit von Java , für neue Sachen selten
        try {
            checkedExceptionDemo();//nent weder try-catch oder throws in Kopfzeile
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    static void  demoCall() throws Exception {
        checkedExceptionDemo();
    }

    static void checkedExceptionDemo() throws Exception{
        throw new Exception();
    }
}

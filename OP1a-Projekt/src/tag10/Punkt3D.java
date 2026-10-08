package tag10;

public class Punkt3D {
   // Instanzvariable; Meist private
    private int x;
    private int y;
    private int z;

    // Statische Varablen(klassenvariablen)
    static int anzahl;

    // Instanzmethoden
    public void verschieben(int dx, int dy, int dz) {
        x +=dx;
        y += dy;
        z += dz;
    }
    public void ausgabe(){
        System.out.printf("(%d,%d,%d) %n", x, y, z);
    }
  // Statische Methoden (Klassenmethoden)
    static void main(String[] args) {

        Punkt3D p = new Punkt3D();
        anzahl++;
        System.out.println("p = " + p);
        p.ausgabe();
        p.verschieben(3, -2, 0);
        p.ausgabe();
        p.verschieben(1, 0, -3);
        p.ausgabe();

        Punkt3D q = new Punkt3D();
        anzahl++;
        System.out.println("anzahl = " + anzahl);
        q.ausgabe();
        q.verschieben(12, -4, 7);
        q.ausgabe();
    }
}

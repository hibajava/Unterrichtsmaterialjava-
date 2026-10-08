package tag3;

public class DattentypenDemo {
    static void main(String[] args) {
        // ganzzahlige Typen
        byte b = 127;// Bereich -128 bis 127
        short s = 12393; // 2 Bytes
        int i = -2_123_456_976;// 4 Bytes
        long l = 123_456_789_123L;// 8 Bytes
        // Kommazahlen
        double d = 234.3456345;// 8 Bytes
        float f = -23.456F;// 4 Bytes, f statt  F als suffix möglich

        // wahrheitswerte
        boolean boll = true;

        // Zeichenkette
        char c = 'g';
        String string = "Hallo, Welt";
    }
}

package tag4;

// Agenda: Detaillierte Informationen über ganze Zahlen in Java
//الأجندة: معلومات مفصلة عن الأعداد الصحيحة في جافا
public class Integerinfo {
    static void main(String[] args) {
        int n = 2456;
        // Interessant zu wissen : Kleinsmögliche, größtmögliche zahl
        //من المثير للاهتمام أن نعرف: أصغر رقم ممكن، أكبر رقم ممكن
        // zu int als elementare Typ gehört die Klasse Integer
        //يُعتبر int من النوع الأساسي وتنتمي إليه الفئة Integer

        int max = Integer.MAX_VALUE;
        System.out.println("max = " + max);

        // Ü:minimaler int wert
        int min = Integer.MIN_VALUE;// Konstante in der Klasse integer
       // ثابت في الفئة integer
        System.out.println("min = " + min);

        // Ü: gibt es weitere konstanten in der Klasse Integer?
        // 3 Stück, nicht reverant in Praxis
         //٣ قطع، غير ذات صلة في الممارسة
        System.out.println(Integer.TYPE);

        // Ganz Zahlen: Dezimal, Hexadezimal, Binär, Oktal
        int zahlDezimal = 17;
        int zahlHexadezimal = 0x11;// 0x präfix für hexadezimal; 1*16 + 1*1
        // Ü:binäre und oktale Darsellung
        int zahlBinär = 0b10001;//0b präfix, 1*16 + 0*8 +0*4 + 0*2 +0*1
        int zahlOktal= 021;// 0 präfix, 2*8 + 1*1
        System.out.println("zahlBinär = " + zahlBinär);
        System.out.println("zahlOktal= " + zahlOktal);
        System.out.println("zahDezimal = " + zahlDezimal);
        System.out.println("zahlHexadezimal = " + zahlHexadezimal);

        //Ü: wie sieht die zahl 17 im 7er-System und 3er-sytem aus?


    }
}

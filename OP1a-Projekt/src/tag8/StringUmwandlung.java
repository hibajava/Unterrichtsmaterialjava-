package tag8;

public class StringUmwandlung {
    static void main(String[] args) {
        // String ala Quelle
        String s = "1234";
        int n = Integer.valueOf(s);
        System.out.println("n = " + n);

        n = Integer.valueOf("102",3);// zahlensystem mit Basis 3
        System.out.println("n = " + n);

        double d = Double.valueOf("67.31");
        System.out.println("d = " + d);

        boolean b = Boolean.valueOf("true");
        System.out.println("b = " + b);

        // String als ziel
        int i = 12 ;
        System.out.printf("%d %n ", i);

        s = String.valueOf(i);
        System.out.println("s = " + s);

        System.out.println(String.valueOf(false));
    }
}

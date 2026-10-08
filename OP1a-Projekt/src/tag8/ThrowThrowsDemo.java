package tag8;


public class ThrowThrowsDemo {
    public static void main(String[] args) throws Exception {
        printStringUpperCase("Kotlin");
        //printStringUpperCase(null); // Schlüsselwort
        printStringLowerCase("Python");
    }

    static void printStringUpperCase(String s) {
        if (s == null) {
            throw new IllegalArgumentException("null not allowed");
        }
        System.out.println(s.toUpperCase());
    }

    static void printStringLowerCase(String s) throws Exception {
        if (s == null) {
            throw new Exception("null not allowed");
        }
        System.out.println(s.toLowerCase());
    }
}
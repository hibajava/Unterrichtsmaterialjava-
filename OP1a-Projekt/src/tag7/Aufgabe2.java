package tag7;
/*Recherchieren: Was sind rekursive Algorithmen. Mindestens einen selbst implementieren, z.B.
Fakultät einer positiven ganzen Zahl
oder die ersten Fibonacci-Zahlen*/
public class Aufgabe2 {
    static void main(String[] args) {
    long res = factorial(25);
        System.out.println("res = " + res);
        // Ü: Größere ganze zahlen als long: BigInterger beliebig groß
    }

    private static long factorial(int n) {
        // Abbruchbedingung
        if (n==1){
            return 1;
        }else{
       return factorial(n-1)* n;
    }
}}

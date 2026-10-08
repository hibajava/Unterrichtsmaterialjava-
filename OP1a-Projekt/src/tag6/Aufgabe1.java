package tag6;
/*Muster mit variabler Zeilenzahl ausgeben, auch anderes Symbol soll möglich sein.
*
**
***
****
*****
 */
public class Aufgabe1 {
    static void main() {
        int n = (int)(Math.random() * 10) + 2;
        for (int i = 1; i <= n;i++){
            printZeile(i, '+');
        }
        }
        private static void printZeile(int n, char ch){
        for (int i= 0; i <= n ; i++){
            System.out.print(ch);
        }
            System.out.println();
    }}


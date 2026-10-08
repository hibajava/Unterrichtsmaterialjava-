import java.util.ArrayList;
import java.util.Arrays;

// Wiederholungen zu mehrdimensionalen Arrays
public class MehrdimensionaleArrays {
    public static void main(String[] args) {
        // Wiederholung Arrays
        int[] test = {1, 2, 3, 4};
        int[] test2 = new int[4];

        // Array-Ausgabe
        for(int name : test){
            System.out.print(name);
        }
        System.out.println();

        // Array-Ausgabe eine Zeile über Utils
        System.out.println(Arrays.toString(test));

        // Mehrdimensionale Arrays
        int[][] multiTest = new int[4][5];
        multiTest[2][2] = 55;

        // Matrix
        int[][] matrize = new int[2][3];
        matrize[0][0] = 0;
        matrize[0][1] = 1;
        matrize[0][2] = 2;
        matrize[1][0] = 3;
        matrize[1][1] = 4;
        matrize[1][2] = 5;

        // For Each
        printMultiArray(matrize);

        // Matrix umdrehen
        int[][] transpMatrize = transponiereMatrize(matrize);

        printMultiArray(transpMatrize);

        // Standardwerte
        // Leeres Array
        int[][] leeresArray = new int[2][3];
        System.out.println(leeresArray[0][0]);
        System.out.println(leeresArray[1][2]);
        printMultiArray(leeresArray);
//        for(String[] zeile : leeresArray){
//            System.out.println(Arrays.toString(zeile));
//        }

        // Integer vs int
        // Integer ist auf null setzbar, int nicht
        // int ist ein primitiver Datentyp
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add(0, null);
        System.out.println(arrList.toString());

        double[] leerDoubleArray = new double[5];
        System.out.println(Arrays.toString(leerDoubleArray));


        // Koordinaten für Mehrdimensionale Arrays erkunden
        int[][] arr = {
                {1, 2, 3, 4},
                {1, 2, 3, 4, 0, 2, 1},
                {1, 2, 3, 4, 2, 1, 2, 4},
                {1, 2, 3}
        };

        for(int i = 0; i < arr.length; i++){
            int[] zeile = arr[i];
            System.out.println(i + " ist so lang: " + zeile.length);
            System.out.println(Arrays.toString(zeile));
        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + " : " + j +" ist " +arr[i][j]);
            }
        }
    }

    // Ausgabe mehrdimensionales Array
    private static void printMultiArray(int[][] arr) {
        for(int[] zeile : arr){
            System.out.println(Arrays.toString(zeile));
        }
    }

    // Matrix umdrehen
    public static int[][] transponiereMatrize(int[][] matrize){
        int[][] transponiert = new int[matrize[0].length][matrize.length];
        // Zeilen und Spalten vertauschen
        for(int i = 0; i < matrize.length; i++){
            for(int j = 0; j < matrize[i].length; j++){
                transponiert[j][i] = matrize[i][j];
            }
        }
        return transponiert;
    }
}
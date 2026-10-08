package tag6;

public class SchleifenDemo {
    static void main(String[] args) {
        // 4 Arten: for , foreach, while, do-while
        for (int i = 1; i <= 5 ; i++) {
            System.out.printf("%d ", i);

        }
        System.out.println("\n***************");

        int[] iArr = {1, 2, 3, 4, 5};
        for(int n: iArr){
            System.out.printf("%d " , n);
        }
        System.out.println("\n************");

        int j = 1;
        while(j <= 5){
            System.out.printf("%d " , j);
            j++;
        }
        System.out.println("\n****************");
        j=1;
        do {
            System.out.printf("%d " , j);
            j++;

        }while (j <= 5);
    }
}

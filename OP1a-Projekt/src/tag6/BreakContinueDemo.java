package tag6;

import java.util.List;

public class BreakContinueDemo {
    static void main(String[] args) {

        while(true) {
            double d = Math.random();
            System.out.println(d);
            if(d > 0.9){
                break;
            }
        }

        List<Double> liste = List.of(1.344, 5.9384, 0.2345, 6.456);
        for(double d: liste){
            System.out.println(d);
            if(d>= 1.0){
                continue;
            }else {
                System.out.println("Das war eine kleine zahl.");
            }
        }
    }
}

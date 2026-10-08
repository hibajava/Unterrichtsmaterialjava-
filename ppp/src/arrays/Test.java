package arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
      int[] zahlen = new int[7];

      zahlen[0] = 1;
      zahlen[1] = 2;
      zahlen[2] = 3;
      zahlen[3] = 4;
      zahlen[4] = 5;

      zahlen[0] = 7;

//    for(int i : zahlen)
//    {
//        System.out.println(i);
//    }

        //--------------------------------------
    //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> automarken = new ArrayList<>();
        automarken.add("Mercedes");
        automarken.add("BMW");
        automarken.add("Audi");

        for(String auto : automarken);
        {
            System.out.println("auto");
        }

        System.out.println("Bitte eine weitere Automarke hinzufügen: ");
        Scanner input= new Scanner(System.in);
        String neueautomarken = input.next();
        automarken.add(neueautomarken);

        for(String auto : automarken)
        {
            System.out.println(auto);
        }
    }

}

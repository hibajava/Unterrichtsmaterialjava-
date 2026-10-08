package stringverarbeitung;

import java.util.Arrays;

public class stringumdrehen {
    public static void main(String[] args)
    {

        String wort = " Java";

        String umdrehen = "";


        //Das Wort umdrehen
        char[] buchstaben = wort.toCharArray();

        System.out.println(Arrays.toString(buchstaben));

        for(int i = buchstaben.length-1; i >=0; i--)
        {

           System.out.print(buchstaben[i]);
        }
    }
}
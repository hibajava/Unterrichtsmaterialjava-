package arrays;

import java.util.Arrays;

public class ArraaysSortieren
    {
        public static void main(String[] args)
        {
            int[] zahlen = {4, 7, 9, 55, 0};

            Arrays.sort(zahlen);

            //for-each-Schleife
            for(int z : zahlen)
            {
                System.out.println(z);
            }
        }}


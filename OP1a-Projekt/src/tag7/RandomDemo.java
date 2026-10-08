package tag7;

import java.util.Random;
import java.util.TreeSet;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

    public class RandomDemo {
        public static void main(String[] args) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int zahl = random.nextInt(1, 7); // unten inklusiv, oben exklusiv
                System.out.println(zahl);
            }

            // Ü: 6 Lottozahlen 1 - 49 in geeigneter Collection speichern
            TreeSet<Integer> treeSet = new TreeSet<>(); // TreeSet ist automatisch sortiert
            while (treeSet.size() < 6) {
                int zahl = random.nextInt(1, 50);
                treeSet.add(zahl);
            }
            System.out.println("treeSet = " + treeSet);

            float f = random.nextFloat(10.0F);
            System.out.println("f = " + f);

            boolean b = random.nextBoolean();
            System.out.println("b = " + b);

        }
    }


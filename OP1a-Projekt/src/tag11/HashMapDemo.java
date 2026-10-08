package tag11;

import java.util.HashMap;

public class HashMapDemo {
    static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("USB-Stick", 20);// Ein einzelner Eintrag
        hashMap.put("Notebook" , 3);

        System.out.println("hashMap = " + hashMap);

        // Ü: Dritter Eintrag
        hashMap.put("Monitor", 5);
        System.out.println("hashMap = " + hashMap);


    }
}

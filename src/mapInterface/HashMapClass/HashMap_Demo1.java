package mapInterface.HashMapClass;

import java.util.HashMap;

public class HashMap_Demo1 {

    static void main() {

        HashMap<Integer, String> map = new HashMap<>(); // 1️⃣ Declaration of hash map

        // 2️⃣ Adding elements inside hash map in key-value pair
        map.put(101, "Harsh");
        map.put(102, "Radhu");
        map.put(103, "Vasu");
        map.put(104, "Vikas");
        map.put(105, "Manish");

        System.out.println(map);    // {101=Harsh, 102=Radhu, 103=Vasu, 104=Vikas, 105=Manish}
    }
}

package arrayDemo;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class HashMapPractice {
    /*
       Map is an Interface. HashMap is a class. HashMap implements Map.
       HashMap can hold two data types
       Hashmap store data as key/value pairs
       Key cannot be duplicate whereas value can be duplicate

     */

    public void mapDemo(){
        HashMap<Integer, String> cars = new HashMap<>();

        cars.put(1, "Rickshaw"); // Here 1 is key, and Rickshaw is Value
        cars.put(2, "Murirtin");
        cars.put(3, "Volvo");
        cars.put(4, "Leguna");
        cars.put(5, "Tomtom");
        cars.put(5, "Volvo");


        System.out.println(cars);

        System.out.println(cars.get(4));

        cars.remove(5);
        cars.clear();
        cars.isEmpty(); // boolean value
        // Research -- HashTable

    }


    public static void main(String[] args) {
        HashMapPractice obj = new HashMapPractice();
        obj.mapDemo();
    }
}

package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    /*
    List is an Interface. Arraylist is a class. ArrayList implements List.
    ArrayList Allows/hold dupliate values
    Array is static whereas Arraylist is dynamic
    Arraylist follows insertion order
    Null value - Research
     */
    public void listPractice(){

      List<String> students = new ArrayList<>();

     boolean isEmptyBeforeAdd = students.isEmpty();
        System.out.println("Empty Before adding elements "+isEmptyBeforeAdd);

       int sizeBeforeAdd = students.size();
        System.out.println("Size before add "+sizeBeforeAdd);

        students.add("Arafat");
        students.add("Jobayda");
        students.add ("Sarita");
        students.add ("Majed");
        students.add( "Suriya");
        students.add("Arafat");

        boolean isEmptyAfterAdd = students.isEmpty();
        System.out.println("Empty After adding elements "+isEmptyAfterAdd);

        int sizeAfterAdd = students.size();
        System.out.println("Size After add "+sizeAfterAdd);

        // get all the studetns name
        System.out.println(students);

      String oneName=  students.get(2);
        System.out.println(oneName);

       boolean Sarita =  students.contains("Sarita");
        System.out.println(Sarita);

        students.add("Shorna");
        students.add("Duaa");

        System.out.println("After added Shorna and Duaa "+students);
        // Remove Jobayda
        students.remove(1);
        System.out.println("After removing Jobayda");
        System.out.println(students);

        students.set(1, "Anjuman");

        System.out.println("after adding Anjuman "+students);

        //students.clear();
        Collections.shuffle(students);
        System.out.println("After Shuffling "+students);

        Collections.sort(students);
        System.out.println("After sorting "+students);

        System.out.println(students.indexOf("Majed"));

    }


    public void listOfNumber(){
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        number.add(20);

        System.out.println(number);

     int maxValue =  Collections.max(number);
        System.out.println(maxValue);

        int minValue =  Collections.min(number);
        System.out.println(minValue);


        for (int i = 0; i<number.size();i++){
            System.out.println("the value of i "+number.get(i));
        }




    }

    public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        obj.listPractice();
        //obj.listOfNumber();
    }


}

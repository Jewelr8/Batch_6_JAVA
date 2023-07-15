package arrayDemo;

import org.w3c.dom.ls.LSOutput;

public class ArrayPractice {

    // single Variable can take only one value
    //int []age = {20, 21, 22, 23};

    String [] name = {"Bashir", "Akshara", "Tarikuzzaman"}; // index order...0, 1, 2,
    // what is characteristics of Array -- it is fixed in length
    // Array is static
   // String name1[] = new String[]{"Bashir", "Akshara", "Tarikuzzaman"};

        // Array variable
    public void arraydemo1(){

//        name[0] = "Bashir";
//        name[1] = "Akshara";
//        name [2] = "Tarikuzzaman";

//        System.out.println("The name of the isntructor is " + name[0]);
//        System.out.println("The name of the isntructor is " +name[1]);
//        System.out.println("The name of the isntructor is " +name[2]);
       // System.out.println("The name of the isntructor is " + name[3]);

        for (int i = 0; i<name.length;i++){
            String firstone =name[i];
        }

        // for each loop

        for (String studentsName:name){
            System.out.println(name);
        }

       int lengthofArray= name.length;
        System.out.println(lengthofArray);

        /*
        Very common interview questions:
        What are the java exceptions you have encountered
        i. Arrayindexoutofboundexception
        ii.
         */

    }




    String students = "Sumaia";
    int i = 2;


    public static void main(String[] args) {
        ArrayPractice obj = new ArrayPractice();
        obj.arraydemo1();
    }
}

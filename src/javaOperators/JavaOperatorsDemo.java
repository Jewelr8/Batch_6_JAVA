package javaOperators;

import java.time.chrono.ThaiBuddhistEra;

public class JavaOperatorsDemo {


    // Arithmatic
    // Relational
    // Logical Operator
    // Assignemnt operator...

    public static void arithmaticOperators(){
        // Arithmatics operators are -- +, -, *, /.....

        int a = 20;
        int b = 9;
        int result = 0;
        result = a+b;
        System.out.println(result);

        result = a-b;
        System.out.println(result);

        result = a*b;
        System.out.println(result);

        float height = 20/9f;
        System.out.println(height);

      float fraction = (float)a/b;
        System.out.println(fraction);

//        byte	Stores whole numbers from -128 to 127
//        short	Stores whole numbers from -32,768 to 32,767


        byte wheels = 4;
        short x = wheels;
        System.out.println(x);

        short regNo = 32712;
        byte y= (byte)regNo;
        System.out.println(y);
    }

    public static void relationalOperators(){
        // relational Operators are >,<, >=,<=, != will return boolean value
        int a = 20;
        int b = 9;
        boolean result = false;


        result = a>b;
        System.out.println(result);

        result = a<b;
        System.out.println(result);

        result = a>=b;
        System.out.println(result);

        result = a!=b; // != not equal
        System.out.println(result);
    }

    public static void logicalOperators(){
        // logical operators are && (and), ||(OR), and also return boolean value
        int a = 20;
        int b = 9;
        int c = 5;


        boolean resutl1 = (a>b) && (b<c);
        System.out.println(resutl1);


        boolean result2 = (b<a)||(a<c);
        System.out.println(result2);

        boolean result3 = (a>b)||(b<a)&&(a<c);
        System.out.println(result3);
    }


    public static void main(String[] args) {
//        JavaOperatorsDemo obj = new JavaOperatorsDemo();
//        obj.arithmaticOperators();
       // arithmaticOperators();

      //  relationalOperators();

        logicalOperators();

    }


}

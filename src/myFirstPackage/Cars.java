package myFirstPackage;

public class Cars {    // carle barces

    //  properties -- Variables
    //  Functions -- Methods

    /* cars -- class
    properties -- color, wheels, backdoor, back mirror ,engine, model,   -- how the object looks like

  behaviour-- run fast, speed faster, change the gear, carries goods, -- how it functions
    my car,
    Jewel's car
    Ashraf's car
    your car
     */
    //

    // Package alwasy starts with lower case, no space but other words should be upper case
    // Class always starts with upper case, no space but the other words should be upper case

    /* Data Types

    Primitive(Old) Data Type
    byte	Stores whole numbers from -128 to 127
    short	Stores whole numbers from -32,768 to 32,767
    int	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long    Store whole number from 9,223,372,036,854,775,807
    float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
   double	Stores fractional numbers. Sufficient for storing 15 decimal digits
   boolean  Stores true or false values
   char     Store single value


     Non - Primitive(New) Data Types
     String
     Class
     Array

     */
// Variable has three parts -- i. Declaring ii. defining/initializing iii. using
    // I can declare variables in two places i. inside class ii. inside method
    // When I declare inside class -- this is called instance/global variable
    // when I declare variable inside any mehtod -- that is called local variable
    byte wheels;
    short milage;
    int regNo;
    //long  ----
    float height;
    double length;
    boolean isEV;
    char FirstLetter;
    String color;

    /* Is Java is 100% object oriented Programming Language--
     Answer -- Because of primitive data types these are not class... i cannot create objects of primitive data types..

     */

        public void speed(){     // Functions -- Method --- custom method
           System.out.println("Car can be operated speedily");
        }

        public void changingGear(){   // Functions -- Method --- custom method
            System.out.println("Gear can be changed frequently in the car");
        }


        // IDE -- Integrated Development Environment

    public static void main(String[] args) {   // special method given by Java itself to run the code.

  // whatever command I pass over here, it will run

      // byte wheels; //declaring -- local variable
       //wheels = 4;// defining/initialing
//        short milage = 32767;
//        int regNo =   2147483647;
//        //long  ----
//        float height = 3.235455f;
//        double length = 100.85085205235825;
//        boolean isEV = false;
//        char FirstLetter = 'T';
//        String color = "Red";


        Cars mycar = new Cars(); // object of the Cars class

        mycar.wheels = 4 ;
        mycar. milage = 32767;
        mycar.regNo = 2147483647;
        //long  ----
         mycar.height = 3.235455f;
        mycar.length =100.85085205235825;
        mycar.isEV = false;
        mycar. FirstLetter = 'N';
        mycar.color= "Red";
        System.out.println(mycar.milage);
        // calling the method/function
        mycar.speed();
        mycar.changingGear();



        Cars jewelsCar = new Cars();
        jewelsCar.wheels = 4 ;
        jewelsCar. milage = 32334;
        jewelsCar.regNo = 214343647;
        //long  ----
        jewelsCar.height = 3.2343455f;
        jewelsCar.length =100.853352525;
        jewelsCar.isEV = true;
        jewelsCar. FirstLetter = 'M';
        jewelsCar.color= "White";

        // calling the method
//        jewelsCar.speed();
//        jewelsCar.changingGear();

    }



}



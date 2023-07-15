package scannerDemo;

import java.util.Scanner;

public class ScannerPractice {

    // There is a Scanner class.... created by Java
    // why do we use scanner? We use Scanner to read user input from the console.



    public void myscaner(){
        System.out.println("hello");

     Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your First Name");
     String myName =   scan.nextLine();
        System.out.println("I am reading my name from Console "+myName);

        System.out.println("Enter Street Address");
      int myStreetAddress=  scan.nextInt();
        System.out.println("My Street address is "+myStreetAddress);

        // Homework -- use other data types-- like short, boolean, long, float
    }




    public static void main(String[] args) {
        ScannerPractice obj = new ScannerPractice(); // instantiated the class...
        obj.myscaner();
    }
}

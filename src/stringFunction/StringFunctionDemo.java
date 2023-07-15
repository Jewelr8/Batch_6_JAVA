package stringFunction;

import java.nio.charset.StandardCharsets;

public class StringFunctionDemo {


    public static void stringPractice(){
        String name = "Upright";
       int lengthOfMyString= name.length();
        System.out.println(lengthOfMyString);
        //System.out.println(name.length());
    }

    public static void changeCase(){
        String name = "Upright";
     String upper =   name.toUpperCase();
        System.out.println(upper);
    String lower = name.toLowerCase();
        System.out.println(lower);
    }


    public static void splitString(){
        String schoolName = "Upright_Tech Solutions"; // {"Upright", "Tech Solutions"}
      String [] arrayofSchoolName =   schoolName.split("_");
        System.out.println(arrayofSchoolName.length);
        System.out.println(arrayofSchoolName[0]);
        System.out.println(arrayofSchoolName[1]);

        // Home work .... split with limit
        String NewschoolName = "Upright Tech Solutions";
        String [] arrayofSchoolName1 =   NewschoolName.split(" ", 2);

    }


    public static void stringtoInt(){
        String money = "fifty";
        System.out.println(money + 100);
      int money1=  Integer.parseInt(money);
        System.out.println(money1+100);

    }


    public static void intToString(){
        int money = 200;
        System.out.println(money+100);
       String newMoney = String.valueOf(money);
        System.out.println(newMoney+100);
    }

    public static String subStringDemo(){
        String email = "uprighttechsolutions@gmail.com";
      String newtText =  email.substring(7); // +1
        //System.out.println(newtText);
        return newtText;
    }

    public static void replaceDemo(){
        String email = "uprighttechsolutions_gmail.com";
    String newEmail=    email.replace("_", "@");
        System.out.println(newEmail);
    }





    public static void reverse(){
        String schoolName = "UprightTechSolutions"; // thgirpU
//        System.out.print(schoolName.charAt(6));
//        System.out.print(schoolName.charAt(5));
//        System.out.print(schoolName.charAt(4));
//        System.out.print(schoolName.charAt(3));
//        System.out.print(schoolName.charAt(2));
//        System.out.print(schoolName.charAt(1));
//        System.out.print(schoolName.charAt(0));

        for (int i = schoolName.length()-1; i>=0; i--){
            System.out.print(schoolName.charAt(i));
        }

    }


    public static void reverseBuffter(){
        String schoolName = "UprightTechSolutions";
        StringBuffer sb = new StringBuffer(schoolName);


        sb.insert(6, "_");
        System.out.println(sb);
        sb.append("Hello");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }


    public static void palindromeDemo(){
        // madam --- madam
        // Kayak - Kayal
        // Mom -- mon
        String name = "mom";
        String rev = "";
        for (int i = name.length()-1; i >=0; i--){
           rev =  rev+name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("this is not palindrome");
        }
    }
/* HomeWork
1. lets say String name =  "uprighttechsolutions@gmail.com";
validate that if the string has "@" symbol then print (" it is ok").

2. Lets say
String name = "my name is bashir";

write program so that you can print the following
  "My Name Is Bashir"


 */


    public static void main(String[] args) {
       //stringPractice();
        //changeCase();
        //splitString();
        //stringtoInt();
       // intToString();
//      String printNewText =   subStringDemo();
//        System.out.println(printNewText);
        // validation

//        if (printNewText.equalsIgnoreCase("tech")){
//            System.out.println("We are good");
//        }
//        else {
//            System.out.println("please check back the string");
//        }

        //replaceDemo();
        //reverse();
      //  reverseBuffter();
       // palindromeDemo();

    }
}

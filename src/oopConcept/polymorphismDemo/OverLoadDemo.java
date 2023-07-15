package oopConcept.polymorphismDemo;

public class OverLoadDemo {

    /* Polymorphism is another OOP Principle. Poly means Many... morphism mens form.
    that means many forms.

    That means we can have many forms of method.

    There are two kinds of Polymorphism.
    i. Method Overloading
    ii. Method Overriding

    Let's say you are working on Three Applications. each application has different url
    and different login information.

    Method overloading can be achieved keeping the same method name with different number of
    parameter, different data types and different order of parameter.
     */

    /**
     * This method is careted for www.macys.com.
     * @param username
     * @param password
     */

    public void login(String username, int password){ // method signature
        // www.macys.com
        System.out.println("Macys front-end credential");
    }

    // assertEqual

    /**
     * this method is creted for www.macyscard.com
     * @param username
     * @param pin
     * @param password
     */
    public void login(String username, int pin, int password){
        System.out.println("Macy's card credential");
    }

    /**
     * this method is created for macys backend
     * @param number
     * @param hostUserName
     */
    public void login(int number, String hostUserName){
        System.out.println("macy's backend credential");
    }


    public static void main(String[] args) {
        OverLoadDemo obj = new OverLoadDemo();
        obj.login(43545,"Bashir");
        obj.login("BashirUddin", 345);
        obj.login("BashirTipu", 123, 45456);
    }





}

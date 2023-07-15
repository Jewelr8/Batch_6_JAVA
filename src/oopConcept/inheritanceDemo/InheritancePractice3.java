package oopConcept.inheritanceDemo;

public class InheritancePractice3 extends InheritancePractice2{

    String timeZone;
    String State;



    public static void main(String[] args) {

        InheritancePractice3 obj = new InheritancePractice3();
        obj.hello();
        obj.name = "Bashir";
        obj.location = "New York";
        obj.group = "Selenium";
        obj.Zip = 11354;
        obj.timeZone = "EST";
        obj.State = "New York";



    }

}

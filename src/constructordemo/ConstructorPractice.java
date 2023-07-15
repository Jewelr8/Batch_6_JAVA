package constructordemo;

public class ConstructorPractice {
/*Cosntructor is a special method that hold the same name as class. we can parametrize the constructor
and give argument while creating an object.

There are two types of constructor?

i. Parameterized
ii. default
 */
// constructor won't return anything.
    String name;
    int id ;
    String location;
    boolean isMale;

        public ConstructorPractice(String name, int id,String location, boolean isMale){
          this. name = name;
          this.  id = id;
            this. location = location;
           this. isMale = isMale;
        }

    public ConstructorPractice(){ // default parameterized
        System.out.println("hi");
    }


    public static void main(String[] args) {
        ConstructorPractice obj = new ConstructorPractice("Arafat", 101,"New York", true );
        System.out.println(obj.name+" " +obj.id+ " "+obj.location+ " "+  obj.isMale );

        System.out.println("----------------------------------------");

        ConstructorPractice obj2 = new ConstructorPractice("Suriya", 102, "New York", false);
        System.out.println(obj2.name+" " +obj2.id+ " "+obj2.location+ " "+ obj2.isMale);

        System.out.println("----------------------------------------");

        ConstructorPractice obj3 = new ConstructorPractice("Sarita", 103, "Texas", false);
        System.out.println(obj3.name+" " +obj3.id+ " "+obj3.location+ " "+ obj3.isMale);


        ConstructorPractice obj4 = new ConstructorPractice();

    }
}

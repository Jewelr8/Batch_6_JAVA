package finalKeyword;

public final class FinalSuper {

    /*
    Final variable cannot be modified
    Final method cannot be overridden
    Final class cannot be extended.

     */

   final String name = "Bashir"; // instance variable


    public void UprightTechSolutions(){
        String mode = "online";
    }




    public static void main(String[] args) {
        FinalSuper obj = new FinalSuper();
        //obj.name = "Tipu";

        System.out.println(obj.name);

    }


}

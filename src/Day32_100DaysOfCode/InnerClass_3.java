package Day32_100DaysOfCode;

class Computer{

    public void config(){
        System.out.println("In Computer Config");
    }
}

/*class AdvComputer extends Computer{

    public void config(){
        System.out.println("In Advance Computer");
    }
}*/


public class InnerClass_3 {

    public static void main(String[] args) {

        //Anonymous Inner class,Because its not have any name
        Computer obj= new Computer()

            //Actually a class
        {
            //we are Overriding
            public void config(){
                System.out.println("Something New");
            }

        };
        obj.config();
    }
}

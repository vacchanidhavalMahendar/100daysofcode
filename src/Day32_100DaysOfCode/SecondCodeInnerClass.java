package Day32_100DaysOfCode;

abstract class Computer1{

    public abstract void config();
}

/*class Laptop extends Computer1{

    public void config(){
        System.out.println("Its in Config,Its Working Dear");
    }

}*/

public class SecondCodeInnerClass {

    public static void main(String[] args) {

        //Anonymous Class
        Computer1 obj= new Computer1(){
            //Overriding the config method here
            public void config(){
                System.out.println("Its Working fine dear");
            }
        };
        obj.config();
    }

}

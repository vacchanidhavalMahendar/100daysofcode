package Day41_100DaysOfCode;
class Demo1{
    void disp(){

        try{
            System.out.println("Method Started");
            System.exit(0);
        }
        finally{
            System.out.println("Method Ending");
        }
    }
}


public class LaunchFinallySE {
    public static void main(String[] args) {

        Demo1 d= new Demo1();
        d.disp();
    }
}

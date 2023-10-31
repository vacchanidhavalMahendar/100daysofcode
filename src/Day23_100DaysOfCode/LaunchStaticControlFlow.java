package Day23_100DaysOfCode;

public class LaunchStaticControlFlow {
    //static variable
    static int a;
    static int b;

    //static block
    static{

        System.out.println("Inside Static block");
        a=10;
        b=20;
    }

    //static method called
    static void disp(){
        System.out.println("Static Display Method");
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        System.out.println("Iam in the main method");
        disp(); //static method called
    }



}

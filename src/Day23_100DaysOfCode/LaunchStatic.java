package Day23_100DaysOfCode;

class Demo{

    static int a;
    static int b;

    static {
        System.out.println("static block");
        a=10;
        b=20;
    }

    static void disp(){
        System.out.println("Static Method");
        System.out.println(a);
        System.out.println(b);

    }

    int x;
    int y;
    //Normal Java Block
    {
        x=10;
        y=20;
        System.out.println("Non Static Java Block");
    }

    Demo(){
        System.out.println("Constructor is called");

    }

    void disp1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println("Non Static Method");
    }
}



public class LaunchStatic {
    public static void main(String[] args) {

     Demo.disp();
     Demo d= new Demo();
     d.disp1();
    }
}

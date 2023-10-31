package Day23_100DaysOfCode;

import javax.crypto.spec.PSource;

class Demo2{

    static int a;

    static{
        a=10;
    }

    static void disp(){

        System.out.println("Static Display"+a);

    }
}


public class StaticMethod {

    static void disp2(){
        System.out.println("Disp2 Method");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        disp2();
        Demo2.disp();

        Demo2 d= new Demo2();
        d.disp();


        Demo2.disp();

    }
}

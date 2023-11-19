package Day38_100DaysOfCode;


import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface DemoDhaval{

    void disp();
}

class Trail implements  DemoDhaval{
    public void disp(){
        System.out.println("Hello Java lover");
    }
}


public class Demo1 {
    public static void main(String[] args) {
        //Traditional way
        Trail t= new Trail();
        t.disp();

        //By using lambda expression and one lin eof implementation
        DemoDhaval d=()->
               // {
                        System.out.println("Helo All Learbers");
       // };
    }
}

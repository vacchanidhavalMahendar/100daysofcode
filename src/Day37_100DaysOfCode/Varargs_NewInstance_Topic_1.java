package Day37_100DaysOfCode;

// TOPIC:23rd Nov Live Class varargs and new vs newInstance()

class Demo{

    //JDK1.5V Called Var-args(ellipse)
    public void add(int...x){
        System.out.println("This is an var args argument ka method");
    }
}


public class Varargs_NewInstance_Topic_1 {

    public static void main(String[] args) {

        Demo d= new Demo();
        d.add();
        d.add(10);
        d.add(10,20);
        d.add(10,20,30);

    }
}

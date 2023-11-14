package Day33_100DaysOfCode;

class Sample{

    //Method
    public void m1(){

    }
}

interface IDemo{

    //unimplemented method
    void m2();
}

class DemoImpl extends Sample implements  IDemo {
    public void m2(){
        System.out.println("We have Implemented the m2 method");
    }
}



public class InterfaceContTestApp {
    public static void main(String[] args) {
        DemoImpl d= new DemoImpl();
        d.m2();
    }
}

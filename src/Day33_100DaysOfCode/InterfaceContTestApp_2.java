package Day33_100DaysOfCode;

interface IDemo1{

    void m1();
}

interface IDemo2{

    void m2();
}

interface IDemo3 extends IDemo1,IDemo2{

    void m3();
}

class SampeImpl implements  IDemo3{

    //implements given to all m1 and m2 and m3

    public void m1(){
        System.out.println("m1 method Implementation");
    }

    public void m2(){
        System.out.println("m2 method Implementation");
    }

    public void m3(){
        System.out.println("m3  method Implementation");
    }
}



public class InterfaceContTestApp_2 {
    public static void main(String[] args) {

    }
}

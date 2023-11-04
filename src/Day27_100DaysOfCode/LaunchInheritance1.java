package Day27_100DaysOfCode;

class Demo1{

    //Instance variable
    String name="DhavalMahendar";
    int age=27;

    //method or task
    void disp(){
        System.out.println("Demo1"+ age+ name);
    }


}

class Demo2 extends Demo1{

}



//Demo2 is child class/derived/sub
//Demo1 is super /parent/base/existing
public class LaunchInheritance1 {

    public static void main(String[] args) {

        //Demo2 class Object
        Demo2 demo= new Demo2();
        //Code reusability
        demo.disp();
    }
}

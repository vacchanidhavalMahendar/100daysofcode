package Day27_100DaysOfCode;
//Inheritance Concepts
//Parent Class
//MultiLevel Inheritance
class Demo11{
    String name="DhavalMahendar";
    int age=27;

    void display(){
        System.out.println("Demo1" +age + name);
    }

}

class Demo12 extends Demo11{

}

class Demo13 extends  Demo12{

}


public class LaunchMultiLevelInheritance {
    public static void main(String[] args) {
    Demo13 d= new Demo13();
            d.display();
    }
}

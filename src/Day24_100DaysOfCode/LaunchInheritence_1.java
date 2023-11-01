package Day24_100DaysOfCode;

//TOPIC:Inheritence

//Parent
class Parent{

    //variables
    int a,b;

    //Constructor called
    Parent(){
        //Initialize variables
        a=101;
        b=200;
        System.out.println("Parent Constructor called");
    }

    //Parent Parameterized Constructor
    Parent(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("parent Parameterized Constructor");

    }
}

//Child is inheriting the property or behaviour of parent
class Child extends  Parent{

    //Variable
    int x,y;

    //Child constructor
    Child(){
        this(111,222);
        x=1000;
        y=2000;

    }

    Child(int x,int y){
        this.x=x;
        this.y=y;
    }
    //Disp method with no return type
    void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }

}

public class LaunchInheritence_1 {
    public static void main(String[] args) {

        Child ch= new Child();
        ch.disp();

        Child ch1= new Child(1000,2000);
        ch1.disp();
    }
}

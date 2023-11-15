package Day34_100DaysOfCode;

//During the child clas object creation,Only child class object is created but not the parent class object(still constructor of parent object is called to bring the properties of parent to child)
class Parent {

    Parent(){
        System.out.println("Parenr Class Constructor");
        System.out.println(this.hashCode());
    }
}

class Child extends Parent{

    Child(){
        super();
        System.out.println("Child Class Constructor");
        System.out.println(this.hashCode());
    }
}

public class TestApp_1 {
    public static void main(String[] args){

        Child c= new Child();
        //Constructor is called during object creation
        System.out.println(c.hashCode());
    }
}

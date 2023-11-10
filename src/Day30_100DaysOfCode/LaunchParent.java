package Day30_100DaysOfCode;

//Parent class or Derived class
class Parent1 {

    public void cry() {
        System.out.println("Parent is crying");
    }
}

    class Child1 extends Parent1{

        public void cry(){
            System.out.println("Child1 Cries at lower voice");
        }


    }

    class Child2 extends Parent1{

        public void cry(){
            System.out.println("Child2 Cries at Higher voice");
        }


    }




//RunTime Polymorphism

public class LaunchParent {

    public static void main(String[] args){
        //Tight Coupling
        Child1 c1= new Child1();
        Child2 c2= new Child2();

        //Calling the method by object reference
        c1.cry();
        c2.cry();

        //Parent Class Reference
        Parent1 ref;
        //c1 reference we are giving to the parent class reference
        ref=c1;     //With the help of parent clas reference,we are calling child class Methods
        //
        ref.cry();
        ref=c2;
        ref.cry();

    }
}




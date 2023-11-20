package Day39_100DaysOfCode;

class Parent{

  //static method can be called using className and reference of object
  public static void disp(){
      System.out.println("Hello Parent");
  }

}
class Child1 extends Parent{

    //Method Overriding
    //if we write static method override and it will not get overiden,so its called as method Hiding
   public static void disp(){
        System.out.println("Hello Child1");
    }
}

//Static methods do participate in inheritance
public class MethodHiding_1 {
    public static void main(String[] args) {
        //Object Creation is done
        //referebce can be change either should be object or parent type

        Parent p=new Child1();
    p.disp();
        Child1 c= new Child1();
        c.disp();
    }
}

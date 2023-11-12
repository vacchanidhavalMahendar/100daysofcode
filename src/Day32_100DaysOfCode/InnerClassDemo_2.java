package Day32_100DaysOfCode;

 class InnerClassDemo_2 {

     public  void show(){

         System.out.println("In Show");
     }

     class B{
         public void config(){
             System.out.println("In Config Method");
         }
     }
}

public class FirstCode{

    public static void main(String[] args) {
        InnerClassDemo_2 obj= new InnerClassDemo_2();
        obj.show();
        InnerClassDemo_2.B obj1;

        obj1=obj.new B();
        obj1.config();

    }
}
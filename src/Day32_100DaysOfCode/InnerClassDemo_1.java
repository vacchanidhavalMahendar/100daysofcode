package Day32_100DaysOfCode;

public class InnerClassDemo_1 {

    int num;
    A obj1= new A();

    public void show(){
        System.out.println("In Show"+ num);
        obj1.config();
    }
    //Inner Class
    class A{
        public void config(){
            System.out.println("In Config Method");
        }
    }


    public static void main(String[] args) {

        InnerClassDemo_1 obj= new InnerClassDemo_1();
        obj.show();

    }
}

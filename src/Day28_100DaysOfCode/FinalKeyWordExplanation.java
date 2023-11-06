package Day28_100DaysOfCode;

/*1.final keyword Explanation Notes

        1 . final -->Apply to class,Methods,Variables
        2.what will Happen if we apply to class,Methods,Variables

        2.Apply final to the class,What will Happened

        so Final Class will not Inheritance
        As final class cannot participate in Inheritence.


        3.Apply to final method
final will get inherited but we cannot override.

        4.Final Variables Acts as Constant we cannot Change the value.*/

//Parent class

//final class Vehicle
//{
//	void disp()
//	{
//		System.out.println("vehicle");
//	}
//}


//class Car extends Vehicle //final class we cannot inherit
//{
//	   // final class doesn't participate in inheritance
//}

//final class Vehicle
//{
//	void disp()
//	{
//		System.out.println("vehicle");
//	}
//}


//class Car extends Vehicle //final class we cannot inherit
//{
//	   // final class doesn't participate in inheritance
//}
class Vehicle
{
    int i=10;
    final void disp()
    {
        i=20;
        System.out.println(i);
        System.out.println("vehicle");
    }
}
class Car extends Vehicle
{
//	 void disp() final will get inheirted but we cannot ovveriride
//	 {
//		 System.out.println("disp");
//	 }
}

public class LaunchFinalK {

    public static void main(String[] args) {

        Car c=new Car();
        c.disp();

    }

}



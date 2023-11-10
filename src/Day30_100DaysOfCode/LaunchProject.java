package Day30_100DaysOfCode;

import java.util.Scanner;

//abstract class,because if one abstract method is there,Then need to make class as abstract

abstract class Shapes
{   //variable
    float area;

    //abstract method or Un Implemented Method
    abstract public void input();
    abstract public void compute();

    //Concrete method
    public void disp()
    {
        System.out.println("The area is "+ area);
    }

}


//Inheritance concept
//taking the property or behaviour from parent class

class Rectangle extends Shapes
{
    //variables
    float length;
    float breadth;

    //Method
    public void input()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the length of rectangle");
        length=scan.nextFloat();
        System.out.println("please enter the breadth of rectangle");
        breadth=scan.nextFloat();
    }

    //Compute Method
    public void compute()
    {
        area=length*breadth;
    }
}

//Inheritance
class Square extends Shapes
{
    //variables
    float length;


   //Method
    public void input()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the length of square");
        length=scan.nextFloat();
    }

    //Method
    public void compute()
    {
        area=length*length;
    }
}

//Inheritance
class Circle extends Shapes
{
    //
    float radius;
    final float pi=3.14f;
    public void input()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the radius of circle");
        radius=scan.nextFloat();
    }
    public void compute()
    {
        area=pi*radius*radius;
    }

}

class Geometry
{
    void permit(Shapes s)
    {
        s.input();
        s.compute();
        s.disp();
    }
}

public class LaunchProject {

    public static void main(String[] args) {

        Rectangle r=new Rectangle();
        Square s=new Square();
        Circle c=new Circle();

        r.input();
        r.compute();
        r.disp();

        s.input();
        s.compute();
        s.disp();

        c.input();
        c.compute();
        c.disp();

    }

}


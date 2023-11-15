package Day34_100DaysOfCode;

//Can absy
abstract class Person{
    String name;
    int age;
    int height;
    int weight;
    Person(String name,int age,int height,int weight){
        super();
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight weight;
    }
}
class Student extends Person{
    int rollno;
    int marks;
    Student(String name,int age,int height,int weight,int rollno,int marks){
        super(name,age,height,weight,rollno);
        this.rollno=rollno;
        this.marks=marks;
    }
}


public class TestApp_2 {
    public static void main(String[] args) {

    }
}

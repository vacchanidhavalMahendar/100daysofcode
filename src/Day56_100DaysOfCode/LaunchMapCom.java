package Day56_100DaysOfCode;
import java.util.*;
class Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    @Override
    public String toString()
    {
        return name + " " +age + " " + city ;
    }
}

public class LaunchMapCom {
    public static void main(String[] args) {

    Student s1= new Student("Rohan",18,"Mumbai");
        Student s2= new Student("Rahul",18,"Bengaluru");
        Student s3= new Student("Rohan",19,"Delhi");

        //To Store the Data in the Form of key value pairs
        HashMap hm= new HashMap();
        hm.put(1,s1);
        hm.put(2,s2);
        hm.put(3,s3);

        //Just for Debugging Purpose
        System.out.println(hm);

        //Collection View
        //entry set


    }
}

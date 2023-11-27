package Day44_100DaysOfCode;

import Day37_100DaysOfCode.Student;

import java.util.ArrayList;

 class InstanceOf {
    public static void main(String[] args) {

        //Inbuilt object where we can keep any type of object
        ArrayList al= new ArrayList();
        al.add(new Student()); //oth position
        a1.add(new Cricketer()); //First Position
        a1.add(new Customer());//Second position

        Object o= al.get(0);
        if(o instanceof Student){

            Student s=(Student) o;
            //Perform Student Specific Operation

        }

        else if(o instanceof  Customer);


    }
}

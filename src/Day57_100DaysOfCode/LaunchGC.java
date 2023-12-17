package Day57_100DaysOfCode;

import java.util.*;

class Employee{
    private int empid;
    private String name;
    private String empAddr;

//We can have setters and getters

    @Override
    public String toString(){
        return "Dhaval";
    }

    @Override
    public void finalize(){
        System.out.println("Garbage Collector Collected the Object");
    }

}

public class LaunchGC {
    public static void main(String[] args) {

        //Employee Class Object
        Employee e= new Employee();
        HashMap hm= new HashMap();
        hm.put(e,"Dhaval");
        //some Statements
        //Statements
        e=null; //e is reference variable of employee type pointing to employee object
        //if its holding null,there is employee object to which no one is referring and Eligible for Garbage Collection.
        //Myself invoke garbage collecetot
        System.gc(); //internally garbage collector calls finalize method


    }
}

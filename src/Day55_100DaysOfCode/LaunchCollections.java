package Day55_100DaysOfCode;

import java.lang.reflect.Array;
import java.util.*;
public class LaunchCollections {
    public static void main(String[] args) {

        TreeSet ts= new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(175);
        System.out.println(ts);

        //Sort the data in arrayList
        ArrayList al= new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        ts.add(175);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        //If the data is Complex data then we need to go with Comparator and Comparable
        //Concept of Comparable and Comparator

        ArrayList<String> al2= new ArrayList<String>();
        //al2.add(100);
        al2.add("Dhaval Patel");
        al2.add("INeuron");
        al2.add("Najafi code");
        //al2.add(500);
       // al2.add(1750);
        Collections.sort(al2);
        System.out.println(al2);

        ArrayList<Integer> al3= new ArrayList<Integer>();
        al3.add(100);
        al3.add(200);
        al3.add(600);
        al3.add(700);
        al3.add(800);
        Collections.sort(al3);
        System.out.println(al3);

        //










    }
}

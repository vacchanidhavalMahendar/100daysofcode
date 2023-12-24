package Day60_100DaysOfCode;

import java.util.*;
class Test4
{
    public static void main(String[] args)
    {
//Sorting of objects will happen based on default natural sorting order
        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("Z");
        ts.add("L");
        ts.add("B");
        ts.add(null);//NullPointerException
        ts.add(10);//ClassCastException
        System.out.println(ts);//[A,B,L,Z]
    }
}

package Day60_100DaysOfCode;

import java.util.*;
class Test3
{
    public static void main(String[] args)
    {
//Sorting of objects will happen based on default natural sorting order
        TreeSet ts = new TreeSet();
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        System.out.println(ts);//ClassCastException
    }
}

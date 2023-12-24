package Day61_100DaysOfCode;

import java.util.*;
/*
interface Comparable{
    public int compareTo(Object obj);
}*/

//If we keep object inside TreeSet,internally jvm uses compareTo() method and It sorts the Object,Based on sorting result the object will be stored in TreeSet.

//obj1.compareTo(obj2)
/*
Returns –ve if and Only if obj1 has to Come Before obj2.
        Returns +ve if and Only if obj1 has to Come After obj2.
        Returns 0 if and Only if obj1 and obj2 are Equal.
*/


public class TestComparator_1 {
    public static void main(String[] args) {

        TreeSet ts= new TreeSet();
        ts.add("A");
        ts.add("Z");
        ts.add("K");
        System.out.println(ts);
        System.out.println("********************");
        System.out.println("A".compareTo("Z"));//-ve value
        System.out.println("Z".compareTo("K"));// +value
        System.out.println("Z".compareTo("Z"));// zero
        System.out.println("Z".compareTo(null));//NPE

    }
}

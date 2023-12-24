package Day61_100DaysOfCode;

import java.util.*;

class MyComparator1 implements Comparator{

    @Override
    public int compare(Object obj11,Object obj22){

        Integer  i1= (Integer) obj11;
        Integer  i2= (Integer) obj22;

        if(i1<i2){
            return +1;
        }
        else if(i1>i2){
            return -1;
        }
        else
            return 0;
    }
}

public class Test3_4 {
    public static void main(String[] args) {

        TreeSet ts= new TreeSet();
        ts.add(10);
        ts.add(0);
        ts.add(15);
        ts.add(5);
        ts.add(20);
        ts.add(20);
        System.out.println(ts);


    }
}


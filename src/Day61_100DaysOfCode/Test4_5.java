package Day61_100DaysOfCode;
import java.util.*;

class MyComparator1 implements Comparator{

    @Override
    public int compare(Object obj1,Object obj2){
        String s1=(String) obj1;
        String s2=(String) obj2;

        //Reverse of Natural Order
        return s2.compareTo(s1);

    }
}


public class Test4_5 {
    public static void main(String[] args) {

        TreeSet ts= new TreeSet(new MyComparator1());
        ts.add("Savhin");
        ts.add("pointing");
        ts.add("gayle");
        ts.add("debeleors");
        ts.add("jaysuriya");
    }
}

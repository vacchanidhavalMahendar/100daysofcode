package Day55_100DaysOfCode;

import java.util.Enumeration;
import java.util.Vector;

public class LaunchVector {
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add(100);
        v.add(200);
        v.add(300);
        v.add(400);
        v.add(500);

        Enumeration em= v.elements();
        while(em.hasMoreElements()){
            System.out.println(em.nextElement());
        }

    }
}

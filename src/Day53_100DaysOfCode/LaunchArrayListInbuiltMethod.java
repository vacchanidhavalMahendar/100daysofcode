package Day53_100DaysOfCode;
import java.util.ArrayList;

public class LaunchArrayListInbuiltMethod {
    public static void main(String[] args) {


        ArrayList al = new ArrayList();

        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        System.out.println(al);

        boolean res= al.contains(44);
        System.out.println(res);


        int index= al.indexOf(22);
        System.out.println(index); //1

        System.out.println(al.isEmpty());
        al.ensureCapacity(10);
        System.out.println(al.size());
        al.trimToSize();




    }
}

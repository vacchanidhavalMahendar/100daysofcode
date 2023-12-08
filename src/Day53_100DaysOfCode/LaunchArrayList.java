package Day53_100DaysOfCode;


import java.util.ArrayList;

public class LaunchArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        //Homogeneous Type of data is allowed
        System.out.println(a);
        System.out.println("*");

        ArrayList a2 = new ArrayList();
        a2.add("patel");
        a2.add(28);
        a2.add('b');
        a2.add(18.5);
        //Here data is heterogeneous
        System.out.println(a2);


        System.out.println("*********************");

        ArrayList a3 = new ArrayList();
        a3.addAll(a2);
        System.out.println(a3);

        System.out.println("*********************");

        ArrayList a4 = new ArrayList();

        a4.add(11);
        a4.add(22);
        a4.add(33);
        a4.add(44);
        System.out.println("Existing Data " + a4);
        a4.add(2, 28);
        System.out.println("After Adding to the second Index" + a4);
        a4.add(0, 5);
        System.out.println("After Adding to the Zeroth Index" + a4);
/*
    }   a4.add(55);
        System.out.println("After Adding to the rear end"+ a4);
*/

    }
}


package Day53_100DaysOfCode;

import java.util.ArrayDeque;

public class LaunchArrayDeque {
    public static void main(String[] args) {

        ArrayDeque ad= new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        System.out.println(ad);
        ad.addFirst(5);
        ad.addFirst(35);
        System.out.println(ad);


    }
}

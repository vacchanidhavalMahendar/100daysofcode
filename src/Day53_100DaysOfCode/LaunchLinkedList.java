package Day53_100DaysOfCode;
//LinkedList

import java.util.LinkedList;

public class LaunchLinkedList {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.add(10);
        ll.add("INeuron");
        ll.add(20);
        System.out.println(ll);
        ll.addFirst("DhavalPatel");
        System.out.println(ll);
        ll.add(3,"Bengaluru");
        System.out.println(ll);

        ll.addLast("RichMond Town");
        System.out.println(ll);



    }
}

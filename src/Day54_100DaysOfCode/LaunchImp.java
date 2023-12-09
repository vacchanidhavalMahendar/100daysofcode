package Day54_100DaysOfCode;

import java.util.*;

public class LaunchImp {
    public static void main(String[] args) {

        ArrayList al= new ArrayList();
        al.add(10); //Behind the scene  al.add(new Integer(10);
        al.add(10.5);//Behind the scene  al.add(new Double(10.5);
        al.add('c');//Behind the scene  al.add(new Character('c');
        al.add(10.5f); //Following AutoBoxing
        //System.out.println(al);

        ArrayList al2= new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);
        System.out.println(al2);

        //Different ways to Access Data present within the collection

        //1.Normal Loop
        System.out.println(al2.size());
        for(int i=0;i<al2.size();i++){
            Object o=al2.get(i);
            System.out.println(o);
            System.out.println(al2.get(i)+" ");

        }
        System.out.println();

        //2.For Each Loop
        for(Object obj: al2){
            System.out.println(obj+ " ");
        }
        System.out.println("*************************");

        //Way to Access 3:Iterator
        //al2-->10 20 30 40 50
        //al2.iterator-->It will start activated
        //itr1.hasNext()->Check next to you whether any data is there or not,If it is there get that value
        //itr1.next()-->it will go next and print the values
        Iterator itr=al2.iterator();


       while(itr.hasNext()){
            Integer i=(Integer) itr.next();
           Object obj =itr.next();
           System.out.println(itr.next());

       }

        System.out.println("Reversing the element of Data");
       ListIterator litr=al2.listIterator(al2.size());
       while(litr.hasPrevious()){
           System.out.println(litr.hasPrevious());
       }

       //What if We want to reverse or Access Data of other classes in reverse direction
        TreeSet ad= new TreeSet();
       ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        ad.add(50);
        Iterator it= ad.iterator();
        while(it.hasNext()==true){
            Integer i=(Integer) it.next();
            System.out.println("Array Deque"+ i);

        }

        System.out.println("Added in the LinkedList");
        LinkedList ll= new LinkedList();
        ll.addAll(ad);
        System.out.println(ll);

        ListIterator litr2=ll.listIterator(ll.size());

        System.out.println("Accessing TreeSet Data in reverse");
        while(litr2.hasPrevious()){
            litr2.previous();
            System.out.println(litr2.previous());
        }
    }
}

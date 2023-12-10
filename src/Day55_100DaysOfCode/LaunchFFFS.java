package Day55_100DaysOfCode;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFFFS {
    public static void main(String[] args) {


        ArrayList al = new ArrayList();
        al.add(100);

        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);

/*        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
            al.add(10);

        }*/
        Iterator itr= al.iterator();
        while(itr.hasNext()==true){
            System.out.println(itr.next());

        }

        CopyOnWriteArrayList cp= new CopyOnWriteArrayList();
        cp.add(100);
        cp.add(2000);
        cp.add(3000);
        cp.add(4000);

        Iterator itrr=cp.iterator();
        while(itrr.hasNext()){
            System.out.println(itrr.next());
            cp.add(20202);
        }


    }
}

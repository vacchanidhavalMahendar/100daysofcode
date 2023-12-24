package Day62_100DaysOfCode;
import java.util.function.*;

class MyPredicate implements  Predicate<Integer{

    @Override
    public boolean test(Integer i){
        if(i>10)
            return true;
        else
            return false;
    }
}



public class StreamAPI_Test1 {
    public static void main(String[] args) {
        Predicate<Integer> p= new MyPredicate();
        System.out.println(p.test(10));//false
        System.out.println(p.test(100));//true
        //System.out.println(p.test(true));

    }
}

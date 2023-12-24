package Day62_100DaysOfCode;
import java.util.function.*;


class MyFunction implements Function<String,Integer>{

    @Override
    public Integer apply(String name){
        return name.length();
    }
}

public class StreamApi_Test4 {
    public static void main(String[] args) {
     Function<String,Integer> f= new MyFunction();
     int output=f.apply("Sachin");
        System.out.println(output);

    }
}


//Length of String "sachin"

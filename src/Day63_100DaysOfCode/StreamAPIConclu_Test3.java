package Day63_100DaysOfCode;

import java.util.*;

//public void forEach

public class StreamAPIConclu_Test3 {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("sachin");
        names.add("kohli");
        names.add("Dravid");
        names.add("honi");

        names.forEach(System.out::println); //one one data i take from names and i will print
        //:: -->Method Reference
    }
}

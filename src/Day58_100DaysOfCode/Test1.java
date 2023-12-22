package Day58_100DaysOfCode;

import java.util.*;
public class Test1 {
    public static void main(String[] args) {

     //I need to Hold only String type of data
     //Which one to choose arrays or Generics
     //Arrays:Directly Deals the data at memory level
     //Generics:Deals the data through the API Code
     //Performance High,Go for Arrays
     //Performance low or Compromise,Go for Generics


     //TypeSafety because of non generic version
     ArrayList<String> al= new ArrayList<String>();
     al.add("Dhaval");
     al.add("Dhoni");

    //Type Casting is required
    String name1= al.get(0);
        String name2= al.get(0);

    }
}

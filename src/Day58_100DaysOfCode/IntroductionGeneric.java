package Day58_100DaysOfCode;

import java.util.ArrayList;

//16th Dec Live Class Introduction to Generics in Java_DNotes
public class IntroductionGeneric {
    public static void main(String[] args) {

        //Arrays are excepting only homogeneous or we call it as TypeSafety
        //TypeSafety:You know what type of element ur placing,Due to which array are safe
        //Whenever we work with array,so we already give the type of the array

        String[] s= new String[600];
        s[0]="Sachin";
        s[1]="dhoni";
       // s[2]= new Integer(10); //CE: incompatible type
        //Since its typesafe so typecasting is not required
        String name11= s[0]; //TypeCasting is not Required
        String name22=s[1];


        //Collections:TypeSafety and TypeCasting is not required
        //Use generic features available from JDK 1.5V.

        //Collections are not "TypeSafety"
        ArrayList al= new ArrayList();
        al.add("sachin");
        al.add("dhoni");
        //al.add(new Integer(10));
        ;;
        ;;
        ;;
        ;;
        ;;
        //We Assume the elements present inside the ArrayList is String  and We do retrieval

        //return type of get method is object

    //    String name111=al.get(0); //CE because TypeCasting is required

        String name1=(String)al.get(0);
        String name2=(String)al.get(1);
        //String name3=(String)al.get(2);//No relationship between integer and string,Runtime Exception:ClassCastException



    }
}

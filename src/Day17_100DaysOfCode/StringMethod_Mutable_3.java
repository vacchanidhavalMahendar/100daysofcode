package Day17_100DaysOfCode;

public class StringMethod_Mutable_3 {
    public static void main(String[] args){
        String name="dcaval";
        //i want to replace one data
        String data=name.replace('c','h');
        System.out.println(data);//Return type is string

        String data1="ababab";
        System.out.println(data1.replace('a','b'));
        //OUTPUT:dhaval

    }
}

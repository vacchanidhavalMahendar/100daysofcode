package Day16_100DaysOfCode;

public class StringConcept_4 {
    public static void main(String[] args){

        String str1=new String("dhaval");
        String str2=str1.intern();//it will do searching in SCP area only
        System.out.println(str1==str2);

        String str3="dhaval";
            System.out.println(str2==str3);


    }
}

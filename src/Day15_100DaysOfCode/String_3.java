package Day15_100DaysOfCode;


public class String_3 {
public static void main(String[] args){

    String str1= new String("Dhaval");
    String str2= new String("Dhaval");
    System.out.println(str1==str2);  //false
    System.out.println(str1.equals(str2));//Compares the Content //true


    StringBuilder str3 =new StringBuilder("Dhaval");
    StringBuilder str4= new StringBuilder("Dhaval");
    System.out.println(str3==str4); //false
    System.out.println(str3.equals(str4));//false

}
}

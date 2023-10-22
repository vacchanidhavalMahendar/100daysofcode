package Day15_100DaysOfCode;

//String CASE 1
public class String_2 {
    public static void main(String[] args){
        String s="Dhaval";
        s.concat("Mahendar");  //New object got created with modification,So its immutable

        System.out.println(s);

        StringBuilder str= new StringBuilder("Dhaval");
        str.append("Mahendar");
        System.out.println(str);
    }
}

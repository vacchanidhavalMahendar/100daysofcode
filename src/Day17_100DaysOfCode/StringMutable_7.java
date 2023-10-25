package Day17_100DaysOfCode;
//StringBuffer:Mutable(We can change and changes willl be reflected in the same memory)

public class StringMutable_7 {
public static void main(String[] args){

    StringBuilder sb = new StringBuilder("sachinrameshtendulkar");
    System.out.println(sb.length());//21
    System.out.println(sb.capacity());//21 + 16 = 37
    System.out.println(sb.charAt(20));//'r'
    System.out.println(sb.charAt(100));//StringIndexOutOfBoundsException
}
}

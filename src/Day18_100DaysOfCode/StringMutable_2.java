package Day18_100DaysOfCode;

//public StringBuffer insert(int index,String s)
public class StringMutable_2 {
    public static void main(String[] args) {
     StringBuffer sb= new StringBuffer("abcdefghijklm");
     sb.insert(2,"xyz"); //At 2 index xyz is placed
         System.out.println(sb);
         sb.insert(9,11);
        System.out.println(sb);

        sb.insert(sb.length(),"dhoni");
        System.out.println(sb);


    }
}

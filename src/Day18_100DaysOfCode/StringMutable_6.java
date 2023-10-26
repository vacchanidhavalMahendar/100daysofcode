package Day18_100DaysOfCode;

public class StringMutable_6 {
    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer(1000);
        System.out.println(sb.capacity());

        sb.append("sachin");
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}

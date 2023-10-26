package Day18_100DaysOfCode;

public class StringMutable_3 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("sachinrameshtendulkar");
        sb.delete(6,12);

        sb.deleteCharAt(13);
        System.out.println(sb);

    }
}

package Day36_100DaysOfCode;

public class AutoBoxing_AutoUnBoxing_3 {
    public static void main(String[] args) {

        Integer i1= new Integer("10"); //From JDK11 it is deprecated means we are not using
        Integer i2= Integer.valueOf("10");
        System.out.println(i1);
        System.out.println(i2);
    }
}

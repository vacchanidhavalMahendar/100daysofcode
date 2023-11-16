package Day35_100DaysOfCode;

public class WrapperClassContinuation_2 {
    public static void main(String[] args) {

        Integer i1=Integer.valueOf("1111");
        System.out.println(i1);//1111
        Integer i2=Integer.valueOf("1111",2);
        System.out.println(i2);//15
        Integer i3=Integer.valueOf("ten");
        System.out.println(i3);//RE:NumberFormatException
        Integer i4=Integer.valueOf("1111",37);
        System.out.println(i4);//RE:NumberFormatException

    }
}

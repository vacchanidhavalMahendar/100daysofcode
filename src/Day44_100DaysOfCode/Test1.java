package Day44_100DaysOfCode;

public class Test1 {
    public static void main(String[] args) {

        Thread t= new Thread();
        System.out.println(t instanceof Object);
        System.out.println(t instanceof  Thread);
        System.out.println(t instanceof Runnable);
        //System.out.println(t instanceof  String);
    }
}

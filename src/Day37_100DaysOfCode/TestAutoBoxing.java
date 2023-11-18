package Day37_100DaysOfCode;

public class TestAutoBoxing {

    public static void methodOne(Integer i){
        System.out.println("Auto Boxing");
    }

    public static void methodOne(int... i){
        System.out.println("Var args methods");

    }

    public static void main(String[] args) {
        int x=10;
        methodOne(x); //int implicity type casting
    }
}

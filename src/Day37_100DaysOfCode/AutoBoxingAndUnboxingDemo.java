package Day37_100DaysOfCode;

class AutoBoxingAndUnboxingDemo {
    public static void methodOne(long l) {
        System.out.println("widening");
    }
    public static void methodOne(Integer i) {
        System.out.println("autoboxing");
    }
    public static void main(String[] args) {
        int x=10;
        methodOne(x); // primtive ====> do type casting====> found ==>
//long(binding happens by compiler)
    }
}

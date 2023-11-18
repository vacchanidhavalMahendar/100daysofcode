package Day37_100DaysOfCode;

class AutoNew {
    public static void methodOne(Long l) {
        System.out.println("Long");
    }
    public static void main(String[] args) {
        int x=10;
        methodOne(x); //CE: can't find the method
    }
}

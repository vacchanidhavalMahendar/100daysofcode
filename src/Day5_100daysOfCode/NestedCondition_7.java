package Day5_100daysOfCode;

public class NestedCondition_7 {
    public static void main(String[] args) {

        int a = 8;
        int b = 2;

        if (a > b) {
            if (a == 10) {
                System.out.println("Subtraction");
                System.out.println(a - b);
            } else {
                System.out.println("A is greater but not equal to 10");
            }
        } else if (a == b) {
            System.out.println("Addition");
            System.out.println(a + b);
        } else if (a < b) {
            System.out.println("a is lesser");
        } else {
        }

        int a1 = 10;
        int b1 = 20;
        int c1 = 5;

        if (a1 < b1) {
            if (a1 < c1) {
                System.out.println("A is the least " + a1);
            } else {
                System.out.println("C is the least" + c1);
            }
        } else if (b1 < c1) {
            System.out.println("B is least" + b1);
        } else {
            System.out.println("C is least" + c1);
        }
    }
}
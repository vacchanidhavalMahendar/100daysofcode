package Day4_100daysOfCode;

public class IncrementDecrementConcept_2 {
    public static void main(String[] args){

        int a=5;
        int b;
        b=a++ + --a - a-- - a++;
        System.out.println(a);
        System.out.println(b);

    }
}

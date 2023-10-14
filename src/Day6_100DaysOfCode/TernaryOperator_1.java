package Day6_100DaysOfCode;

//TOPIC:: Ternary Operator, Switch Statement
//DATE:DATE::13 OCT 2023
//DAY::Friday
/*If condition is true, code before the collon(:) is executed
        If condition is false,Code after the collon(:) is executed.

        Syntax : Condition ? T:F*/

public class TernaryOperator_1 {
    public static void main(String[] args){

        int a=10;
        int b=20;
        int c =(a<b)? a:b  ;
        System.out.println(c);//Condition is True so before the collon ,It will be Executed.

    }
}

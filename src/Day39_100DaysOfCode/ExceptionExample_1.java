package Day39_100DaysOfCode;

import java.util.Scanner;

//If there any compileTime issue:No
//Is there any logical mistakes: No
//starting to last application is running fine and its proper application
//From Internet,Everyone can use
//Whoever using num1 and num2 what to put for example they dont know
//100 0
//Its an abrupt termination or abnormal termination,Its happening during runtime

public class ExceptionExample_1 {
    public static void main(String[] args) {

        System.out.println("Connection to Calc application is established");
         try {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the First Number to Divide");

             int num1 = sc.nextInt();
             System.out.println("Enter the second number to divide");
             int num2 = sc.nextInt();

             int res = num1 / num2;
             System.out.println("The res is " + res);
         }
         catch(Exception e){


             System.out.println("Your Trying to divide illogical");
         }
        System.out.println("Connection is Terminated");

    }
}

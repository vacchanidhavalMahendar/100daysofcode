package Day39_100DaysOfCode;

import java.util.Scanner;

public class LaunchM2 {
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
            System.out.println("Enter the Size of an Array");

            int size= sc.nextInt();
            int[] a= new int[size];

            System.out.println("Enter the elem to be inserted in that array");
            int elem=sc.nextInt();

            System.out.println("Enter the position at which elem has to be inserted");
            int pos=sc.nextInt();

            a[pos]=elem;
            System.out.println("Element"+elem +"Inserted at "+ pos+"SuccessFully");


        }

        catch(ArithmeticException ae)
        {
            System.out.println("Please provide non zero denominator");
        }
        catch(NegativeArraySizeException nae)
        {
            System.out.println("Please be positive!");
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Be in your limits, Don't cross it");
        }
        catch(Exception e)
        {
            System.out.println("Wrong input!");
        }
        System.out.println("Connection is Terminated");
    }
}
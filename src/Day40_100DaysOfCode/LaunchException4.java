package Day40_100DaysOfCode;

import java.util.Scanner;

class Alphad{

    void alpha() throws ArithmeticException{
        System.out.println("Connection to Calc application is established");

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the First num to divide");
        int num1=scan.nextInt();
        System.out.println("Enter the second number to divide");
        int num2=scan.nextInt();

        int res= num1/num2;

        System.out.println("The res is"+ res);
        System.out.println("Connection is Terminated");
    }
}

class Beta {

    void beta() throws ArithmeticException{
        Alphad a = new Alphad();
        a.alpha();
    }
}



public class LaunchException4 {
    public static void main(String[] args) {
        try {
            Beta d = new Beta();
            d.beta();
        }
        catch(ArithmeticException e){
            System.out.println("Exception finally handled in the main");
        }
    }
}

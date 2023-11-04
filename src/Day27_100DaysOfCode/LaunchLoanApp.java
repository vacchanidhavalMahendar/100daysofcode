package Day27_100DaysOfCode;

//TODAYS TOPIC:: Static and Inheritance
//For Instance Variable,Memory will allocated for how many objetcts we create separately.
//For static variables,Memory will allocated only once,like same object can be used for all
//In Loan,Principal amount is same or diff:Its Different
//Specific Object Copy,Means Instance variables
//SI is calculated based on RI,PA,TD(Rate of Interest,Princiapl Amount,Time Duration)
//rate of interest,Provided by Bank Person(This copy is generic)


import java.util.Scanner;

class FarmerUser{
    //Formal Bean or Instance Variable
    private float principalAmount;
    private float timeDuration;
    private float simpleInterest;
    private static float rateOfInterest;

    static{
        rateOfInterest=2.5f;
    }
    //Activity Or Method OR Task

    void input(){
        //Taking Input from User
        Scanner scan= new Scanner(System.in);
        System.out.println("Kindly Enter  the Principal Amount");
        principalAmount=scan.nextFloat();

        System.out.println("Kindly Mention time Duration Required");
        timeDuration=scan.nextFloat();

        //define the value or bean
        rateOfInterest=2.5f;
    }

    //compute method
    void compute(){

        simpleInterest=(principalAmount*timeDuration*rateOfInterest)/100;
    }

    //Display Method
    void disp(){

        System.out.println("Simple interest is"+ simpleInterest);
    }





}


public class LaunchLoanApp {

    public static void main(String[] args) {

     //Object 1 -Farmer1
     FarmerUser f1= new FarmerUser();
     FarmerUser f2= new FarmerUser();

     //calling our method
        f1.input();
        f1.compute();
        f1.disp();

       //calling our method for f2
       f2.input();
       f2.compute();
       f2.disp();
    }
}


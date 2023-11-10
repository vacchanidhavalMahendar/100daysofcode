package Day30_100DaysOfCode;


//if one method is abstract,then we need to make class as also abstract
abstract class Loan1{

    //abstract method
    abstract public void dispInt();

    public void welcomeNote(){
        System.out.println("Welcome to Loan Application");
    }
}

class HomeLoan1 extends Loan1{

    //abstract public void dispInt();

    //Implemented the abstract method
    public void dispInt(){
        System.out.println("RI is 12%");
    }
}

class EducationLoan1 extends Loan1{

    //Implemented the abstract method
    public void dispInt(){
        System.out.println("RI is 9%");
    }

}


public class LaunchLoan1 {
    public static void main(String[] args) {
        //Promoting Loose Coupling
        //Loan1 loan=parent reference
        //we can create reference of abstract class

        Loan1 loan =new HomeLoan1();
        loan.dispInt();
        loan.welcomeNote();
        Loan1 loan1= new EducationLoan1();
        loan1.dispInt();


    }
}

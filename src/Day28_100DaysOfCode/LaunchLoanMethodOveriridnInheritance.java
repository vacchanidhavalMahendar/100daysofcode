package Day28_100DaysOfCode;

class Loan{

    void disp(){
        System.out.println("Wekcine to INEURON BANK");
    }

}

class PersonalLoan extends Loan{
    void disp(){

        System.out.println("Personal Loan Application");
    }
}

public class LaunchLoanMethodOveriridnInheritance {
    public static void main(String[] args) {

      PersonalLoan  pl= new PersonalLoan();
      pl.disp(); //Overiden or overiding

    }
}

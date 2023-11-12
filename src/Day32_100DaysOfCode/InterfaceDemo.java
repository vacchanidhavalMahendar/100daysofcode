package Day32_100DaysOfCode;


//interface is service requirement specification
//100% abstract if we want to promote,Then we go fot interface
//It is 100% abstract class

interface  Account{

    //abstract method
    //The methods are abstract and public
     void withDraw();
     void deposit();
     void checkBalance();

    //Concrete Method
/*    public void printPassbook(){

        //Logic
    }*/

}

class Savings extends Account{

}


class Current extends Account{

}


class Salary extends Account{

}


public class InterfaceDemo {
    public static void main(String[] args) {

    }
}

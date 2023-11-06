package Day28_100DaysOfCode;

//CO VARIANT RETURN TYPE

class Interest{

}

//IS A RelationShip
class InterestPersonalLoan extends Interest{

}

class Loans{

    public Interest intrest(){

        //Object of Interest class
        Interest it= new Interest();
        return it;
    }
}

class PersonalLoans extends Loans{

    public InterestPersonalLoan interest(){

        InterestPersonalLoan ipl= new InterestPersonalLoan();
        return ipl;  //we are returning ipl object reference

    }
}




public class LaunchLoans {
    public static void main(String[] args){

    }
}

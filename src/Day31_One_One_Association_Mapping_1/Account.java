package Day31_One_One_Association_Mapping_1;


//Dependant Object first
public class Account {


    //Variables
     String accNo;
     String accName;
     String accType;


    //Constructor Injection
    public Account(String accNo, String accName, String accType) {
        this.accNo = accNo;
        this.accName = accName;
        this.accType = accType;
    }
}

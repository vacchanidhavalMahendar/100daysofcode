package Day31_One_One_Association_Mapping_1;

public class Employee {

    //Fields or Variables
    private String eid;
    private String ename;
    private String eaddr;

    //HAS-A Realtionship
    Account account;


    //Constructor Injection

    public Employee(String eid, String ename, String eaddr, Account account) {
        this.eid = eid;
        this.ename = ename;
        this.eaddr = eaddr;
        this.account = account;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details are:: ");
        System.out.println("EMPID ::"+eid);
        System.out.println("EMPNAME ::"+ename);
        System.out.println("EMPADD :: " +eaddr);
        System.out.println("ACCOUNT Details are::");
        System.out.println("Account No"+account.accNo);
        System.out.println("Account No"+account.accName);
        System.out.println("Account No"+account.accType);
    }
}

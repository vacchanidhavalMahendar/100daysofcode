package Day31_One_One_Association_Mapping_1;

public class TestApp {
    public static void main(String[] args) {


  Account account= new Account("ABC123","SACHIN","SAVINGS");

        // Constructor Injection
        Employee employee = new Employee("IND10", "sachin", "MI", account);
        employee.getEmployeeDetails();

    }

}
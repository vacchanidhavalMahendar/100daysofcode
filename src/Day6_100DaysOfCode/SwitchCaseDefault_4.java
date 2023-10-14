package Day6_100DaysOfCode;

//So if no case are matching,Then Default case will be executed
public class SwitchCaseDefault_4 {
    public static void main(String[] args){
        int number=100;

        switch(number){
            case 101: System.out.println("First Case");
            case 20: System.out.println("Second Case");
            case 10: System.out.println("Third Case"); // This is MATCHING,So third case will be printed
            default:System.out.println("No Case will be Matching");
        }
    }
}


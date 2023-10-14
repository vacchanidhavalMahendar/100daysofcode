package Day6_100DaysOfCode;

//Is there anyway,So we can restrict other cases or condition,Yes we have (break)
//OUTPUT:Frist case
//So,break means line below ,Will not be executed
//break means control will be move out of the block


public class Switch_Break_Statement_5 {
    public static void main(String[] args){
        int number=100;

        switch(number){
            case 100: System.out.println("First Case");
                break;
            case 108: System.out.println("Second Case");
            case 10: System.out.println("Third Case"); // This is MATCHING,So third case will be printed
            default:System.out.println("No Case will be Matching");
        }
    }
}



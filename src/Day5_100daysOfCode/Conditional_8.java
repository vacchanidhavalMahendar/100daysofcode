package Day5_100daysOfCode;

public class Conditional_8 {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;

        if(a<b && a==b)
        {
            System.out.println("A is least");
        }
        else if(b<c && b==a)
        {
            System.out.println("B is least");
        }
        else if(c <a && c<b)
        {
            System.out.println("else block last block");
        }
        else
        {
            System.out.println("Last block");
        }

    }

}

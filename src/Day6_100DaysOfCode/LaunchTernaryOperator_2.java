package Day6_100DaysOfCode;

public class LaunchTernaryOperator_2 {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;
        int res = (a<b)? (a<c ? a:c):(b<c?b:c) ;
        int res1 = (a>b)? (a<c ? a:c):(b<c?b:c) ; //  T OR False Condition ?T:F
        int num1=100;
        int num2=20;
        int num3=60;
        if(num1<num2)
        {
            if(num1<num3)
            {
                System.out.println(num1);
            }
            else
            {
                System.out.println(num3);
            }
        }
        else if(num2<num3)
        {
            System.out.println(num2);
        }
        else
        {
            System.out.println(num3);
        }

        System.out.println(res);
        System.out.println(res1);

    }
}


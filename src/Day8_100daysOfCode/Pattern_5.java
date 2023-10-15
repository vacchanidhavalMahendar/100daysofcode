package Day8_100daysOfCode;

public class Pattern_5 {
    public static void main(String[] args){

        //Here i=Rows
        //Here j= Column

        int n=10;
        for(int i=0;i<n;i++)    //Outer Loop
        {
            for(int j=0;j<n;j++) //Inner Loop
            {

                if((i==0 && j<n-1) || j==0 ||(i==n-1 && j<n-1)|| (j==n-1 &&i>0 &&i<n-1) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}



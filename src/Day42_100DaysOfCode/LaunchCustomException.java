package Day42_100DaysOfCode;

import java.util.Scanner;

//we need to create class of Custom Exception
//and that class needs to extends Exception Class
class InvalidCustomerException extends Exception{
    public InvalidCustomerException(String msg)
    {
        super(msg);
    }

}

class Atm{
    //Assume these fields value is already present in the database
    int userid=1212;
    int password=1111;

    //user entered
    int pw;
    int uid;

    public void input()
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Kindly enter the user id");
        uid=scan.nextInt();

        System.out.println("Kindly enter the pasword");
        pw=scan.nextInt();
    }
    public void verify() throws InvalidCustomerException
    {
        if((userid== uid) && (password == pw))
        {
            System.out.println("Take your cash");
        }
        else
        {
            InvalidCustomerException ice=new InvalidCustomerException("Are you sure? try again bcz wrong input");
            //System.out.println(ice);
            System.out.println(ice.getMessage());
            throw ice;
        }
    }
}

class Bank
{
    public void initiate()
    {
        Atm a=new Atm();
        try
        {
            a.input();
            a.verify();

        }
        catch (InvalidCustomerException e1)
        {
            try
            {
                a.input();
                a.verify();

            }
            catch (InvalidCustomerException e2)
            {
                try
                {
                    a.input();
                    a.verify();

                }
                catch (InvalidCustomerException e3)
                {

                    System.out.println("Oh Choor dude we caught you card is blocked!!");
                    System.exit(0);
                }

            }

        }
    }
}
public class LaunchCustomException {

    public static void main(String[] args) {

        Bank b=new Bank();
        b.initiate();

    }

}

package Day62_100DaysOfCode;

public class StreamAPI_Test5 {
    public static void m1(){
        for (int i = 1;i<=10 ;i++ )
        {
            System.out.println("child thread");
        }
    }
    public static void main(String[] args) throws Exception{
//using method reference binded the method call of run() of interface
         Runnable r = StreamAPI_Test5::m1;
        Thread t =new Thread(r);
        t.start();
        for (int i = 1;i<=10 ;i++ )
        {
            System.out.println("main thread");
            Thread.sleep(1000);
        }
    }
}


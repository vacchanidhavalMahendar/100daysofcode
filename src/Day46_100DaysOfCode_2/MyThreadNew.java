package Day46_100DaysOfCode_2;

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=10;i++)
            System.out.println("child thread");
    }
}
public class MyThreadNew{
    public static void main(String... args){
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);//call MyRunnable run()
        t.start();
        for(int i=1;i<=10;i++)
            System.out.println("main thread");
    }
}

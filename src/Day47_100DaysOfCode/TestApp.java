package Day47_100DaysOfCode;

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=5 ;i++ ){
            System.out.println("child thread");
            Thread.yield();//line-1
        }
    }
}
public class TestApp{
    public static void main(String... args){
        MyThread t= new MyThread();
        t.start();
        for (int i=1;i<=5 ;i++ ){
            System.out.println("Parent Thread");
        }
    }
}

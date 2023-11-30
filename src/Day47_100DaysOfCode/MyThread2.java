package Day47_100DaysOfCode;

class MyThread2 extends Thread{
@Override
public void run(){
        for (int i=1;i<=10 ;i++ ){
        System.out.println("Sita Thread");
        try{
        Thread.sleep(2000);
        }
        catch (InterruptedException e){
        }
        }
        }
        }
 class Test5 {
    public static void main(String... args)throws InterruptedException{
        MyThread t=new MyThread();
        t.start();
        t.join(10000);//line-n1
        for (int i=1;i<=10;i++ ){
            System.out.println("rama thread");
        }
    }
}

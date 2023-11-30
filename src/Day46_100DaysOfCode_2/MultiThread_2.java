package Day46_100DaysOfCode_2;

class MyThread2 extends  Thread{

    @Override
    public void start(){
        System.out.println("Start Method Called");
    }

    @Override
    public void run(){
        System.out.println("No Args Run Method");
    }
}


public class MultiThread_2 {
    public static void main(String[] args) {


        MyThread2 t=new MyThread2();

        //Creating a new thread and startinf a new thread Which calls run
        t.start();

        //Task for main thread
        for(int i=1;i<=10;i++){
            System.out.println("Main Thread");
        }
    }
}

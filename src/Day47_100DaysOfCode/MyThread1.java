package Day47_100DaysOfCode;

public class MyThread1 extends Thread{


    public void run(){
        System.out.println("Priority of the child Thread"+Thread.currentThread().getPriority());
        for (int i=1;i<=5 ;i++ ){
            System.out.println("child thread");
        }
    }
}
}


class Test{

    public static void main(String[] args) {
        System.out.println("Priority of Main Thread"+Thread.currentThread().getPriority());
        MyThread1 t= new MyThread1();
        t.setPriority(10);
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("main thread");

        }
    }
}

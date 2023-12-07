package Day52_100DaysOfCode;

class MyThread5 extends  Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}

public class Test8 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());

        Mythread5 t1= new MyThread5();
        t1.start();

        System.out.println(t1.isDaemon());

    }
}

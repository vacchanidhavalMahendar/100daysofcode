package Day46_100DaysOfCode_2;


class MyThread4 extends Thread{
    public void start(){
        super.start();
        System.out.println("start method");
    }
    public void run(){
        System.out.println("run method");
    }
}



public class MultiThread3 {
    public static void main(String... args){
        MyThread4 t=new MyThread4();
        t.start();
        System.out.println("Main method");
    }
}

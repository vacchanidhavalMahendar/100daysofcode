package Day46_100DaysOfCode_2;

class MyThread1 extends Thread{

    public void run(){
        System.out.println("no arg method");
    }

    public void run(int i){
        System.out.println("Zero Arg method");
    }

}


public class MultiThread_1 {
    public static void main(String[] args) {

        MyThread1 t= new MyThread1();
        t.start();
        //Explicity calling the method and executed by main thread
        t.run(5);


    }

}

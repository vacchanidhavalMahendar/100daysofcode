package Day48_100DaysOfCode;

//Interrupted Exception

class MyThread extends Thread{


    @Override
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Child Thread");
                Thread.sleep(3000);

            }
        }
        catch(InterruptedException e){
            System.out.println("I got Interuppted Exception");
        }

    }
}



public class TestDhav {
    public static void main(String[] args) throws InterruptedException {
        MyThread t= new MyThread();
        t.start();
        t.interrupt(); //parent thread is interuppting child thread
        System.out.println("Iam in Main tgread");
    }
}

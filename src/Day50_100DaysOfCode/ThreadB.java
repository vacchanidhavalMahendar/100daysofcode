package Day50_100DaysOfCode;

class ThreadB extends Thread{
    int total =0;
    @Override
    public void run(){
        for (int i=0;i<=100 ; i++){
            total+=i;
        }
    }
}
public class Test {
    public static void main(String[] args)throws InterruptedException {
        ThreadB b=new ThreadB();
        b.start();
        //stmt-1;
        System.out.println(b.total);
    }
}

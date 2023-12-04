package Day50_100DaysOfCode;

class Display2{
    public void wish(String name){
        ;;;;;;;;;;;;; //l-lakh lines of code
        synchronized(this){
            for (int i=1;i<=10;i++ )
            {
                System.out.print("Good morning:");
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){}
                System.out.println(name);
            }
        }
        ;;;;;;;;;;;;;//1-lakh lines of code
    }
}
class MyThread1 extends Thread{
    Display d;
    String name;
    MyThread1(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
 class Test66  {
    public static void main(String[] args) {
        Display d1=new Display();
        Display d2=new Display();
        MyThread1 t1=new MyThread1(d1,"dhoni");
        MyThread1 t2=new MyThread1(d2,"yuvi");
        t1.start();
        t2.start();
    }
}

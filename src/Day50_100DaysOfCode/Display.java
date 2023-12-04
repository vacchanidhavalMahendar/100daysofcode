package Day50_100DaysOfCode;

 class Display {
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
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
class Test {
    public static void main(String[] args) {
        Display d=new Display();
        MyThread t1=new MyThread(d,"dhoni");
        MyThread t2=new MyThread(d,"yuvi");
        t1.start();
        t2.start();
    }
}


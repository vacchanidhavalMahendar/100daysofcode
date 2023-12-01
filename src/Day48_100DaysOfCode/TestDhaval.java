package Day48_100DaysOfCode;



class Display{

    public void wish(String name){
        for(int i=1;i<=5;i++){
            System.out.print("Good Evening Dear");

            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){

            }
            System.out.println(name);
        }
    }
}

class MyThread extends Thread{


    Display d;
    String name;
    MyThread(Displayy d,String name){
        this.d=d;
        this.name=name;

    }
    @Override
    public void run(){
        d.wish(name);
    }
}



public class TestDhaval {
    public static void main(String[] args) {

    }
}

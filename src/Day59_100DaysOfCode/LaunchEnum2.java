package Day59_100DaysOfCode;

enum Result{


    PASS,FAIL,NR;  //Static final
    //PASS --> public static final Result PASS=new Result();
    //FAIL --> static final Result FAIL =new Result();
    //NR ---> static final Result NR=new Result();
    Result(){
        System.out.println("Constructir is Called");
    }

}


public class LaunchEnum2 {
    public static void main(String[] args) {

        Result res=Result.PASS;
        System.out.println(res);
    }
}

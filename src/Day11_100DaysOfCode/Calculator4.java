package Day11_100DaysOfCode;

class Calculator4{


    float add(float a,int b){
        return a+b;
    }

    float add(float a,float b,int c){
        return a+b+c;
    }

}


 class LaunchMOSC2{
    public static void main(String[] args){

        Calculator4 cal= new Calculator4();
        cal.add(10,20);//Accepting two inputs ,here 10 and 20 are int type,do we have two int values,NO

        System.out.println(cal.add(10,20));
    }
}

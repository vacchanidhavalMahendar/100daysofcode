package Day11_100DaysOfCode;


class Calculator5{


    float add(float a,int b){
        return a+b;
    }

    float add(int c,float a){
        return a+c;
    }

}


 class LaunchMOCS3{

    public static void main(String[] args){

        Calculator5 cal= new Calculator5();

        cal.add(20F,30);
    }
}
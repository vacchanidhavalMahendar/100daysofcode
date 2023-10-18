package Day11_100DaysOfCode;

class Calculator3{

   /* int add(int a,int b){
        return a+b;
    }*/

    void add(int a,int b){
        int res=a+b;
        System.out.println(res);
    }

    float add(int a,float b){
        return a+b;
    }

}


 class LaunchMOCS{

    public static void main(String[] args){

        Calculator3 cal= new Calculator3();

        cal.add(10,20);


    }
}

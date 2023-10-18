package Day11_100DaysOfCode;

 class MethodOverLoading_Calculator_1 {

        int add(int a,int b){ // a nd b are int type so return typs is int
        return a+b;
        }
        int add(int a,int b,int c){
        return a+b+c;
        }

        float	add(int a,float b){
        return a+b;
        }

        float add(float a,float b){
        return a+b;
        }


        float add(int a,float b,float c){
        return a+b+c;
        }

        double add(int a,int b,double c){
        return a+b+c;
        }

        double add(double a,double b,double c){
        return a+b+c;
        }

        double add(int a ,double b,int c){
        return a+b+c;
        }
        }


class LaunchMO{
    public static void main(String[] args){

        MethodOverLoading_Calculator_1 calc=new MethodOverLoading_Calculator_1();

        int a=10,b=20,c=30;
        float m=10.5f,n=20.5f,o=30.5f;
        double x=15.5,y=25.5,z=35.5;

        System.out.println("Hello");
        System.out.println(a);
        System.out.println(calc.add(a,b));
        System.out.println(calc.add(m,n));
        System.out.println(calc.add(a,b,c));
        System.out.println(calc.add(x,y,z));
        System.out.println(calc.add(a,b,x));

    }
}

package Day37_100DaysOfCode;

class Test1
{
    public void methodOne(int... x){
        for(int data: x){
            System.out.println(data);
        }
    }
    public static void main(String... args){
        Test t= new Test();
        t.methodOne(10,20,30);
    }
}


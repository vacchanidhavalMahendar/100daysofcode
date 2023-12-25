package Day63_100DaysOfCode;


@FunctionalInterface
interface Interf22
{
    public void m1(int i);
}
public class StreamAPIConclu_Test2 {
    //logic coded by other developer
    public void m2(int i){
        System.out.println(i*i);
        System.out.println("logic coming from method reference...");
    }
    public static void main(String[] args){
        Interf22 i = x-> System.out.println(x);
        i.m1(10);
        System.out.println();
//method reference(binding the body of m2() to abstract method
        //m1)
        Interf22 i1 = new StreamAPIConclu_Test2()::m2;
        i1.m1(20);
    }
}

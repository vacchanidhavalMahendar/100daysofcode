package Day32_100DaysOfCode;

//ISample:its an Interface
//SRS->specification
//With respect to srs,we dont have any implementation
interface ISample{

    //100% abstract class
    //methods are by default "public and abstract"
    void m1();
    void m2();

}

//implementing the ISample
 class  SampleImpl implements  ISample {

    @Override
    //TO OVERRIDE,method signature never be changed
    public void m1(){
        System.out.println("Hey Implementation Given to m1 method");
    }

    @Override //Indication to Compiler that,These methods are overriden methods
    public void m2(){
          System.out.println("Hey Implementation given to m2 method");
      }


        }





public class TestAppInterface {
    public static void main(String[] args) {

        ISample sample= new SampleImpl(); //Loose Coupling

        sample.m1();
        sample.m2();
    }
}

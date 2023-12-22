package Day59_100DaysOfCode;

//Annotation


/*
@CricketPlayer
class Virat{

}
*/
//Annotaion-->Annotation--->Parent of All Annotations
//Annotations-->Built in
//--->Custom(or User Defined)

@FunctionalInterface //this additional information about these code which is embeded to the code its message to the developer and coder also
interface Trial{
    //one abstract method ,Can we write Lambda expression  yes
    int getNum();
}

class JavaLearning{
    public void disp1(){
        System.out.println("Parent Display");
    }
}
class Focus extends JavaLearning{
    public void disp(){
        System.out.println("Focus is the key");
    }
}


public class LaunchAno {
    public static void main(String[] args) {

        //Lambda Expression,as we have only abstract method
        Trial t =() ->{
          return 10;
        };
    }
}

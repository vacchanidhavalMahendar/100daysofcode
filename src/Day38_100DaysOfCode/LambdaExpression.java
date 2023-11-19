package Day38_100DaysOfCode;

@FunctionalInterface
interface Dhaval{
    void disp();
}

public class LambdaExpression {

    public static void main(String[] args) {

        //Anonymous inner class
        //its not good readibility
        Dhaval d= new Dhaval(){
          public void disp(){
              System.out.println("I have implemented the disp method in the inner class");
          }

        };

    }
}

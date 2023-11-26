package Day44_100DaysOfCode;

public class IsInstanceOf {
    public static void main(String[] args) throws ClassNotFoundException {

        IsInstanceOf t= new IsInstanceOf();

        System.out.println(Class.forName(args[0]).isInstance(t));////arg

    }
}

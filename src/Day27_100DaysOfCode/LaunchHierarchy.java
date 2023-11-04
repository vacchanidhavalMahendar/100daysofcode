package Day27_100DaysOfCode;

//Hierarchy Inheritance

//one Base class can have Multiple Child class,Its Allowed in Java


class Demo111{

    String name="Dhaval";
    int age=27;

    void disp(){
        System.out.println("Demo11"+ age + name);
    }
}

class Demo112 extends Demo111{

}

class Demo113 extends Demo111{

}

public class LaunchHierarchy {
    public static void main(String[] args) {

    }
}

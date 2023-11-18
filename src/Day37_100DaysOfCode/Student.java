package Day37_100DaysOfCode;

public class Student {

    static{
        System.out.println("Student .class file is loading");
    }
    
    Student(){
        System.out.println("Student Constructor is called");
    }
}

public  class Test{
    public static void main(String[] args) {
        
     //Taking input of the classname for which object has to be created during the runtime
     
     String className=args[0];
     Class  c= Class.forName(className);

    a
    }

}

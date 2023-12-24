package Day62_100DaysOfCode;

import Day38_100DaysOfCode.Demo;

import java.util.function.*;

class MyPredicate3 implements  Predicate<String>{
    @Override
    public boolean test(String name) {

        if(name.length()>=3){
            return true;
        }
        else
            return false;
    }
}

public class StreamAPI_Test2 {
    public static void main(String[] args) {



        Predicate<String> p= name->name.length();
        System.out.println(p.test("PWC"); //false
        System.out.println(p.test("CS"));//true
    }
}

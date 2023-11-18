package Day37_100DaysOfCode;
// TOPIC:23rd Nov Live Class varargs and new vs newInstance()

class Demo{

    public void add(int ...x){

        int total=0;
        for(int ele:x){
            total+=ele;
        }
        System.out.println("The Sum is" + total);
    }
}


public class Varargs_NewInstance_Topic_2 {
    public static void main(String[] args) {

    }
}

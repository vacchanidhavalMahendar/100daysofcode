package Day63_100DaysOfCode;
//77.23rd Dec Live Class Stream API in Java_DNotes

class Sample{

    private String s;
    Sample(String s){
        this.s=s;
        System.out.println("Constructor executed for Sample Class");
    }
}

@FunctionalInterface
interface Interf{
    public Sample get(String s);//return type of this abstract class is Sample class
}

public class StreamAPIConclu_Test1 {
    public static void main(String[] args) {

        Interf i= s-> new Sample(s);
        i.get("From Lambda Expression");
        System.out.println();

        //Constructor Reference
        Interf i1=Sample :: new;
        i1.get("From Construtor Reference");
    }
}

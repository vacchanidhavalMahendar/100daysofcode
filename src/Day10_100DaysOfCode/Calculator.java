package Day10_100DaysOfCode;

class Calculator{

    int a,b,c;//Instance Variables or property or fields
//Where we have declared the variables,that is conern
//These variable we can use anywhere in class

//return type is void,

    void add(){
        a=10;
        b=20;
        c=a+b;

        System.out.println(c);

    }
}

 class Launch_Method {
    public static void main(String[] args){

        Calculator c= new Calculator();
        c.add(); //add  method is calle

    }

}

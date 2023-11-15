package Day34_100DaysOfCode;
//TOPIC:wrapper Class:
//To (wrap) primitives into object form so that we can handle primitives also just
  //      like objects.



public class WrapperClass_1 {
    public static void main(String[] args) {

        Integer i1= new Integer(10);
        Integer i2= new Integer("10");

        //i1 is the reference variable

        System.out.println(i1);
        System.out.println(i2);
    }
}

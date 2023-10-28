package Day20_100DaysOfCode;

//TOPIC:: Encapsulation
 class EncapsulationConcept_1 {

     int age; //Instance Variables or Data Members or fields or Property
     String name;//properties
     String city;


}

 class Launch{
    public static void main(String[] args) {

        //Created Object
        EncapsulationConcept_1 st= new EncapsulationConcept_1();

        //Accessing Data Members
        //Outside the class,We are accessing
        //this is not good programming task
        st.age=28;
        st.name="DhavalMahendar";
        st.city="Pune";

    }
}

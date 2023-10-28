package Day20_100DaysOfCode;

class EncapsulationConcept_2 {

    private int age;
    private String name;
    private String city;

    //methods
    //Setting the value or its is called as setter
    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setCity(String city) {
        this.city = city;
    }

    String getCity() {
        return city;
    }
}

class LaunchEncap{
    public static void main(String[] args) {
        EncapsulationConcept_2 st= new EncapsulationConcept_2();

        /*
         * st.age=-28; st.name="Xp12XP"; st.city="Bengaluru";
         */
        //st.age=-28; error bcz age is private
        st.setAge(28);
        int age=st.getAge();
        System.out.println(age);

        st.setName("Hyder");
        System.out.println(st.getName());

    }

}



}

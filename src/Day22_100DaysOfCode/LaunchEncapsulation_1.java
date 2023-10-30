package Day22_100DaysOfCode;
//Encapsulation

class Dog{

    //Bean
    private String name;
    private int cost;


    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}


public class LaunchEncapsulation_1 {
    public static void main(String[] args) {

        Dog d= new Dog();
        d.setName("dhurusu");
        System.out.println(d.getName());

    }
}

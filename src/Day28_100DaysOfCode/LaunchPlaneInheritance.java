package Day28_100DaysOfCode;

//Parent class
class Plane{

    //Method Or Behaviour
    public void takeOff(){
        System.out.println("Plane is Taking off");
    }

    //Method or Behaviour
    //Inherited methods
    public void fly(){
        System.out.println("Plane is Flying");
    }

    //Method Or Behaviour
    public void landing(){
        System.out.println("Plane is Landing");
    }

}

//IS A Relationship or Inheritance
class CargoPlane extends Plane{

    //Method Overiding or overriden
    public void fly(){
        //Body is Different
        System.out.println("CARGo plane is flying at lower heights");
    }

    //Specialized Methods
    public void carryGoods(){
        System.out.println("CargoPlans Carried Goods");
    }

}
//IS A Relationship or Inheritance
class PassengerPlane extends Plane{

    public void fly(){
        System.out.println("PassengerPlane flies at medium height");
    }

    //specialized methods
    public void carryPassenger(){
        System.out.println("PassenderPlane carries passengers");
    }

}

public class LaunchPlaneInheritance {
    public static void main(String[] args) {

      CargoPlane cp= new CargoPlane();
      PassengerPlane pp= new PassengerPlane();
      cp.takeOff(); //inherited method
      cp.fly();  //Over riden method
      cp.landing(); //inherited method
      cp.carryGoods();//Specialized method

        pp.takeOff();
        pp.fly();  //Over riden method
        pp.landing();
        pp.carryPassenger();

    }
}
package Day66_100DaysOfCode;


import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.ObjectOutputStream;
        import java.io.FileInputStream;
        import java.io.ObjectInputStream;
        import java.io.Serializable;

class Dog1 implements Serializable{
    int i=10;
    int j=20;
}
class Cat implements Serializable{
    int i=100;
    int j=200;
}
public class Serialization1_Test2 {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        Dog1 d1=new Dog1();
        Cat c1=new Cat();
        System.out.println("serialization started");
        FileOutputStream fos= new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
        System.out.println("Serialization ended");
        System.out.println("Deserialization started");
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog1 d2=(Dog1) ois.readObject();
        Cat c2=(Cat) ois.readObject();
        System.out.println("Deserialization ended");
        System.out.println("Dog1 object data");
        System.out.println(d2.i+"\t" +d2.j);
        System.out.println("Cat object data");
        System.out.println(c2.i+"\t" +c2.j);
    }
}

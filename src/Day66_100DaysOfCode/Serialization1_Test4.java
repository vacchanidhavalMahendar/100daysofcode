/*
package Day66_100DaysOfCode;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
class Dog4 implements Serializable{
    Cat c1=new Cat();
}
class Cat4 implements Serializable{
    Rat r=new Rat();
}
class Rat implements Serializable{
    int i=10;
}
public class Serialization1_Test4 {
    public static void main(String[] args)throws
            IOException,ClassNotFoundException{
        Dog4 d= new Dog4();
        System.out.println("Serialization Started");
        FileOutputStream fos= new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
        System.out.println("Serialization ended");
        System.out.println("***********************************");
        System.out.println("DeSerialization Started");
        FileInputStream fis= new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d1=(Dog)ois.readObject();
        System.out.println(d1.c1.r.i);
        System.out.println("DeSerialization ended");
    }
}


*/

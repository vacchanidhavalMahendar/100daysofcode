package Day66_100DaysOfCode;
import java.io.*;




    /*
     public java.io.ObjectOutputStream(java.io.OutputStream) throws
    java.io.IOException;
     public java.io.FileOutputStream(java.lang.String) throws
    java.io.FileNotFoundException;
     public final void writeObject(java.lang.Object) throws java.io.IOException;
     public java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException;
     public java.io.FileInputStream(java.lang.String) throws
    java.io.FileNotFoundException;
     public final java.lang.Object readObject() throws java.io.IOException,
    java.lang.ClassNotFoundException;
    */
    class Dog implements Serializable
    {
        static{
            System.out.println("static block gets executed...");
        }
        Dog(){
            System.out.println("Object is created...");
        }
        int i = 10;
        int j = 20;
    }
public class Serialization1_Test1 {

        public static void main(String[] args)throws Exception
        {
            Dog d = new Dog();
            System.out.println("Serialization started.....");
            String fileName = "abc.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            System.out.println("Serialized Object refernce is ::"+d);
            System.out.println("Serialization ended.....");
//To pause the execution till we press some key from keyboard
            System.in.read();
            System.out.println("De-Serialization started.....");
            FileInputStream fis = new FileInputStream("abc.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj=ois.readObject();
            Dog d1 = (Dog)obj;
            System.out.println("De-Serialized Object refernce is ::"+d1);
            System.out.println("De-Serialization ended.....");
        }
//JVM shutdown now
    }

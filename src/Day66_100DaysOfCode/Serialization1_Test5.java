package Day66_100DaysOfCode;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class Account implements Serializable{
    String name="sachin";
    transient String password="tendulkar";
}
public class Serialization1_Test5 {
    public static void main(String[] args)throws
            IOException,ClassNotFoundException{
        Account2 acc=new Account2();
        System.out.println(acc.name +"=====> "+ acc.password);
        System.out.println("Serialization Started");
        FileOutputStream fos= new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(acc);
        System.out.println("Serialization ended");
        System.out.println("***********************************");
        System.out.println("DeSerialization Started");
        FileInputStream fis= new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        acc=(Account2)ois.readObject();
        System.out.println(acc.name +"=====> "+ acc.password);
        System.out.println("DeSerialization ended");
    }
}






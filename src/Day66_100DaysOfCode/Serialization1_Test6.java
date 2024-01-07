package Day66_100DaysOfCode;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
class Account2 implements Serializable{
    String name="sachin";
    transient String password="tendulkar";
    private void writeObject(ObjectOutputStream oos)throws Exception{
        oos.defaultWriteObject();//performing default Serialization
        String epwd="123"+password;//performing encryption
        oos.writeObject(epwd);//write the encrypted data to file(abc.ser)
    }
    private void readObject(ObjectInputStream ois)throws Exception{
        ois.defaultReadObject();//performing default Serialization
        String epwd=(String)ois.readObject();//performing decryption
        password=epwd.substring(3);//writing the extra data to Object
    }
}

public class Serialization1_Test6 {
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






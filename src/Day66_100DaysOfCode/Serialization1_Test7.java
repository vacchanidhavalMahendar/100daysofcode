/*
package Day66_100DaysOfCode;

import java.io.*;
*/
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
*//*

class Account implements Serializable
{
    String userName = "sachin";
    transient String password = "tendulkar";//loss of information
    transient int pin=4444;//loss of information
    //Write a logic of Serialization
    private void writeObject(ObjectOutputStream oos) throws Exception{
        System.out.println("writeObject method is called....");
// perform default serialization
        oos.defaultWriteObject();
// perform encryption on password
        String encypwd = "123" + password;// 123tendulkar
        int encypin = 1111 + pin;// 5555
// write the encrytped data as object to serialized file
        oos.writeObject(encypwd);
        oos.writeInt(encypin);
    }





*/

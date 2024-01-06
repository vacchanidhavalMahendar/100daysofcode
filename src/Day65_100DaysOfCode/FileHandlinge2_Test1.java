package Day65_100DaysOfCode;
import java.io.*;


/*
public int read() throws java.io.IOException;

*/

public class FileHandlinge2_Test1 {
    public static void main(String[] args) throws Exception {

FileReader f1= new FileReader("sachin.txt");
 int i=f1.read();
 while(i!=-1){
     System.out.println((char)i);
     i=f1.read();

 }

    }
}

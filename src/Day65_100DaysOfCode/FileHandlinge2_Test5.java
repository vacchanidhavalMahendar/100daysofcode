package Day65_100DaysOfCode;

import java.io.*;
import java.io.PrintWriter;

public class FileHandlinge2_Test5 {
    public static void main(String[] args) throws IOException {

     FileWriter fw= new FileWriter("abc.txt")  ;
     PrintWriter out= new PrintWriter(fw);

     out.write(100);
     out.println(100);

     out.println(true);
     out.println('c');
     out.println("DenisRitchie");

     out.flush();
     out.close();

    }
}

package Day65_100DaysOfCode;

import java.io.FileReader;
import java.util.File;
public class FileHandlinge2_Test2 {
    public static void main(String[] args) throws Exception {
       File f= new File("sachin.txt");
       FileReader f1= new FileReader(f);

       char[] ch= new char[(int)f.length()];

        //Read one character and store ut inside the character
        f1.read(ch);

        for(char data:ch)
            System.out.println(data);

        f1.close();



    }
}

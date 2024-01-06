package Day64_100DaysOfCode;
import java.io.*;
public class FileHandling_Test5 {
    public static void main(String[] args)   throws Exception{

        String location ="c:\\dhavalFile";
        File f3 = new File(location);
        f3.mkdir();

        File ff= new File(f3,"java.txt");
        ff.createNewFile();


        System.out.println("The New File is Created Successfully"+ff);
    }
}

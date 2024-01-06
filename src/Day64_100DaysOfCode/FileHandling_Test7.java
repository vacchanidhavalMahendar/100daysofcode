package Day64_100DaysOfCode;

import com.sun.jdi.StringReference;

import java.io.*;

public class FileHandling_Test7 {
    public static void main(String[] args)throws Exception
    {
        int dirCount = 0;
        int jpgFileCount = 0;
        int txtFileCount = 0;
        int zipFileCount = 0;
        String location = "D:\\Java Job Guarantee Batch";
        File f= new File(location);
        String[] names = f.list();
        for(String name : names){
// D:\\Java Job Guarantee Batch
// all files we are iterating
            File f1 = new File(f,name);
            if (f1.isDirectory())
                dirCount++;
            if(f1.isFile()){
                if (name.endsWith(".png"))
                    jpgFileCount++;
                if(name.endsWith(".txt"))
                    txtFileCount++;
                if(name.endsWith(".zip"))
                    zipFileCount++;
            }
            System.out.println(name);
        }
        System.out.println("Total no of JPGfiles is :: "+jpgFileCount);
        System.out.println("Total no of txtfiles is :: "+txtFileCount);
        System.out.println("Total no of Zipfiles is :: "+zipFileCount);
        System.out.println("Total no of Directory is :: "+dirCount);
    }
//JVM shutdown now
}

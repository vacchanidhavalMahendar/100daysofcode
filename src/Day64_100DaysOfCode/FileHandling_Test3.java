package Day64_100DaysOfCode;


import java.io.File;
import java.io.IOException;
        public class FileHandling_Test3 {
        public static void main(String[] args)throws IOException{
            File f=new File("IPLTeams");
            System.out.println(f.exists());//false
            f.mkdir();//Creates a new directory
            System.out.println(f.exists());//true
        }
    }

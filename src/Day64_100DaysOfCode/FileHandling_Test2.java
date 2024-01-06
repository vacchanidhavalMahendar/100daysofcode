package Day64_100DaysOfCode;

import java.io.*;
public class FileHandling_Test2 {
    public static void main(String[] args) throws IOException {

        String fileName="abc.txt";

        //This line will check whether abc.txt this file is exists or not,If its available then it will go and point to that file and otherwise it will  represents the java file object not a physical file

        File f= new File(fileName); //Creating an object and its has given fileName and it will create new file in current working directory

        //if files really created ,there is a method called exists();

        System.out.println(f);
        System.out.println(f.exists()); //Really Exits then its true

        //It Will Create a Physical File
        f.createNewFile();
        System.out.println(f.exists());

    }
}

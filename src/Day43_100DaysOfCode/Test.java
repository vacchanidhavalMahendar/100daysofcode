package Day43_100DaysOfCode;

import java.io.BufferedReader;
import java.io.FileReader;

//Requirement 1: whatever resources,it will close automatically
//javap java.lang.AutoCloseable
//tell the resources to implement the interface and body of close method
public class Test {
    public static void main(String[] args) {

        try(final BufferedReader br= new BufferedReader(new FileReader("output.txt"))){
            br= new BufferedReader(new FileReader("output.txt"));

        }
        catch(Exception e){
            e.printStackTrace();

        }

    }
}

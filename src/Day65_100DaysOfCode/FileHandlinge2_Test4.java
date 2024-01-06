package Day65_100DaysOfCode;
import java.io.*;
public class FileHandlinge2_Test4 {
    public static void main(String[] args) throws Exception {
        /*
public java.lang.String readLine() throws java.io.IOException;
*/

        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}

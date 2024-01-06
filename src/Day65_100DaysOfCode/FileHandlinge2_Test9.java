package Day65_100DaysOfCode;
import java.io.*;
public class FileHandlinge2_Test9 {
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String data = br.readLine();
        int maxLength = 0;
        String result = "";
        while (data!=null)
        {
            int resultLength=data.length();
            if (maxLength<resultLength)
            {
                maxLength = resultLength;
                result=data;
            }
            data= br.readLine();
        }
        System.out.println("The maxLength string data in a file is :: "+result);
                System.out.println("The maxLength string in a file is :: "+maxLength);
    }
//JVM shutdown now
}

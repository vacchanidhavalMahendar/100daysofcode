package Day65_100DaysOfCode;

import java.io.*;
public class FileHandlinge2_Test7 {
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter pw = new PrintWriter("output.txt");
        String target = br.readLine();
        while (target!=null)
        {
            boolean isAvailable =false;
            BufferedReader br1 =new BufferedReader(new
                    FileReader("output.txt"));
            String line = br1.readLine();
//control comes out of while looop in smooth fashion without
            break
            while (line!=null)
            {
//if matched control should come out with break
                if (line.equals(target))
                {
                    isAvailable = true;
                    break;
                }
                line=br1.readLine();
            }
            if (isAvailable==false){
                pw.println(target);
                pw.flush();
            }
            target = br.readLine();
        }
        br.close();
        pw.close();
    }
//JVM shutdown now
}
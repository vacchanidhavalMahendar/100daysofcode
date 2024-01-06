package Day65_100DaysOfCode;

import java.io.*;
public class FileHandlinge2_Test3 {
    public static void main(String[] args) throws Exception {

/*
public void newLine() throws java.io.IOException;
*/

                FileWriter fw = new FileWriter("abc.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(105);
                bw.write("Neuron");
                bw.newLine();
                char[] ch ={'P','W','S','K','I','L','L','S'};
                bw.write(ch);
                bw.newLine();
                bw.write("unicorn");
                bw.flush();//to make sure the operation is succesfull on file
                bw.close();//internally fw.close() call will happen
            }
//JVM shutdown now
        }


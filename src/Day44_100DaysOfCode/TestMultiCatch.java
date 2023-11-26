package Day44_100DaysOfCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestMultiCatch {
    public static void main(String[] args) {
        //try with multi catch block
        try{

            //Risky code
            ;;;;;;;;;;;;
            ;;;;;;;;;;;;
            ;;;;;;;;;;;;
            ;;;;;;;;;;;;
            new BufferedReader(new FileReader("sample.txt"));

        }
        catch (ArithmeticException |NullPointerException e){
            e.printStackTrace();
        }
        catch (ClassCastException | IOException e){
            e.printStackTrace();

        }
    }
}

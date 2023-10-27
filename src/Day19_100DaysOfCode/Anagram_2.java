package Day19_100DaysOfCode;

import java.util.Arrays;
import java.util.Locale;

public class Anagram_2 {
    public static void main(String[] args) {
        String s1="Race";
        String s2="carE";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        //compare charcter by character
        //sort and compare

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        //Sorting the character
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("It is an anagram");
        }

        else{{
            System.out.println("It is not an anagaram");
            
        }
        }

    }

}

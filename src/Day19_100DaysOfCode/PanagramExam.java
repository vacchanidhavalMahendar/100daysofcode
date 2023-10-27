package Day19_100DaysOfCode;

public class PanagramExam {
    public static void main(String[] args) {

        boolean flag=false;
     String str="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

     str=str.replace(" ",""); //replace space with no space or empty space
        char[] ch=str.toCharArray();

        int[] ar= new int[26];

        for(int i=0;i<ch.length-1;i++){
            int index= ch[i]-65;
            ar[index]++;
            ar[index]++;  //ar[19]++ --> 0++ --> 1++ --->2
            //ar[ch[i]-65]++;
        }
        for(int i=0; i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("It's not pangram");
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("It's pangram");
        }
    }

}


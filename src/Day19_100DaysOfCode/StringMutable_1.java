package Day19_100DaysOfCode;

//WAP to palindrome or Not
public class StringMutable_1 {
    public static void main(String[] args) {
        String str1="MADAM";
        String str2="";//Empty String

        //for loop

        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);

        }
        System.out.println(str2);

        if(str1.equals(str2)){
            System.out.println("The Given String is Palindrome");
        }
        else{
            System.out.println("The given String is not Palinrome");

        }
    }
}

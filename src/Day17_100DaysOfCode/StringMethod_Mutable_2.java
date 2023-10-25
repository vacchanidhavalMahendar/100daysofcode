package Day17_100DaysOfCode;

//When to use equals method and when to use equalsIgnoreCase
//credentials(gmail)
//username(not case sensitive) equalsIgnoreCase
//password(**)(caseSenstive)


//METHOD 2:public String substring(int begin)
public class StringMethod_Mutable_2 {
    public static void main(String[] args){
        String str="programminglanguage";
        System.out.println(str.length()); //gives the total length of the string
        System.out.println();
        System.out.println(str.substring(9));
        System.out.println(str.substring(0,8));



    }
}

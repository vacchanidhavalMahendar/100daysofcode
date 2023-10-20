package Day13_100DaysOfCode;
//Requirement:want to fetch values from reverse direction
//in foreach loop we dont have access to privelege index
public class LaunchAr_ArrayPart3_3 {
    public static void main(String[] args){

        int[] arr={10,20,30,40};

        for(int i=arr.length-1;i>=0;i--){

            System.out.print(arr[i]+ " ");

        }

    }
}

package Day14_100DaysOfCode;

import java.util.Scanner;
//Binary Search Algorithm

public class BinarySearch {
    public static void main(String[] args){


        int[] array={100,200,300,400,500,600,700,800,900,1000};
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the Key to  be Searched");

        int key=scan.nextInt();
        int low=0;
        int high=array.length-1;

        while(low<=high){
            int midValue=(low+high)/2;

            if(key==array[midValue]){
                System.out.println("Key" + key +"Found at Index" +midValue);
            }

            else if(key<array[midValue]){
                high=midValue-1;
            }
            else if(key>array[midValue]){
                low=midValue+1;

            }
        }

        if(low>high){
            System.out.println("Key is Not Found");
        }

    }
}

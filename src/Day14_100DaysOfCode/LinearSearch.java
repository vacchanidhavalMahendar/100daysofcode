package Day14_100DaysOfCode;

import java.util.Scanner;

//TOPIC:Linear Search,Binary Search,Bubble Sort,Arrays in java
public class LinearSearch{
    public static void main(String[] args){

        int[] ar={10,20,40,30,60,70,80,90};
        boolean flag=false;
        //Taking input from user or console
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the key to be searched");
        int key= scan.nextInt();
        //1.Initialization,2.condition,3.Body,4.update
        for(int i=0;i<ar.length;i++) {

            if (key == ar[i]) {
                System.out.println("Key Found at given index is " + i);
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Key was Not Found at the given index");
        }


    }
}


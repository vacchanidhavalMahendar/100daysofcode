package Day12_100DaysOfCode;

import java.util.Scanner;

public class Launch2_Array_2 {
    public static void main(String[] args){

        //To Store and Display marks of the 5 students
        Scanner scan= new Scanner(System.in);

        int[] ar= new int[5]; //array of int type for 5 memory allocation

    for(int i=0;i<ar.length;i++){
            System.out.println("Please Enter Marks of students"+i);
            ar[i]=scan.nextInt();

    }
    System.out.println("The Marks of Students are as follows");

        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+ " ");
        }

    }
}

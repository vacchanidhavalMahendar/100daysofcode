package Day14_100DaysOfCode;

public class BBS {
    public static void main(String[] args){

        int[] arr={7,5,2,1,3,4,6,10,13,15};

        for(int i=0;i<arr.length;i++){

            for(int j=1;j<arr.length-1;j++){

                if(arr[j]<arr[j-1]){
                    int tempVariable=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tempVariable;


                }
            }
        }

        for(int ele:arr){

            System.out.print(ele+ " ");

        }
    }
}

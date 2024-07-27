package BinarySearch;

import java.util.Scanner;

public class basic_binarySearch {
    public static void main(String[] args) {
        int [] array={1,3,5,6,8,9,21};
        System.out.print("Enter Element to search: ");
        Scanner s=new Scanner(System.in);
        int result=binarySearch(s.nextInt(),array);
        System.out.println(result);
    }

    public static int binarySearch(int n,int [] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    }

}

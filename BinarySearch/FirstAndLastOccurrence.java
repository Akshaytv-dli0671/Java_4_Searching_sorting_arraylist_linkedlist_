package BinarySearch;

import java.lang.annotation.Target;
import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int [] array={1,3,3,3,5,6,8,9,21};
        System.out.print("Enter Element to search: ");
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        int first=FirstOccurrence(target,array);
        int last=LastOccurrence(target,array);
        System.out.println("Index of First occurrence: "+first);
        System.out.println("Index of Last occurrence: "+last);
    }

    public static int FirstOccurrence(int n, int [] arr){
        int low=0;
        int result = -1;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==n){
                 result=mid;
                 high=mid-1;

            }
            else if(arr[mid]>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }

    public static int LastOccurrence(int n, int[] arr){
        int low=0;
        int result = -1;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==n){
                result=mid;
                low=mid+1;

            }
            else if(arr[mid]>n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
}

package LinearSearch;

import java.util.Scanner;

public class Basic_linearSearch {

    public static void main(String[] args) {
        int [] array={1,3,5,6,8,9};
        System.out.print("Enter Element to search: ");
        Scanner s=new Scanner(System.in);
        int result=linearSearch(s.nextInt(),array);
        System.out.println(result);
    }

    public static int linearSearch(int value,int arr[]){
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==value){
                return i;
            }

        }
        return -1;
    }
}


package BinarySearch;

import java.util.Scanner;

public class Largest_smallest {
    public static void main(String[] args) {
        int [] array={1,3,5,6,8,9,21};
        System.out.print("Enter target value: ");
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        int large=findSmallestGE(array,target);
        int small=findLargestSE(array,target);
        System.out.println(large);
        System.out.println(small);

    }

    public static int findSmallestGE(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
    public static int findLargestSE(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

}

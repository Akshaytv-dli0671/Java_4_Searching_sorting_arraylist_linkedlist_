package BinarySearch;

public class PeakValue {
    public static void main(String[] args) {
        int [] array={1,5,6,8,4,3,2};
        int result=peak(array);
        System.out.println("Peak value: "+array[result]);

    }

    public static int peak(int[] arr) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left+right)/2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
             else {
                left = mid + 1;
            }
        }
        return result;
    }
}

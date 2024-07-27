package sorting;

public class Bubble_sort {
    public static void main(String[] args) {
        int [] arr={1,4,2,6,3,7,11,8};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

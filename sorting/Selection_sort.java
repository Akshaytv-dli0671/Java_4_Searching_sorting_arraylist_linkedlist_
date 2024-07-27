package sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 3, 7, 11, 8};

        int j = 0;
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
        System.out.println("Sorted array:");
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}

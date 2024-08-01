package LinearSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class All_occurrences {
    static List<Integer>list=new ArrayList<>();
    public static void main(String[] args) {
        int [] array={1,3,5,1,6,1,8,9};
        System.out.print("Enter Element to search: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        list=all_occurrences(array,num);
        System.out.print("Indices:"+list);

    }
    public static List<Integer> all_occurrences(int[] array,int n){

        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                list.add(i);
            }
        }
        return list;
    }

}

package Arraylist;

import java.util.ArrayList;

public class Reverse {
        public static void main(String[] args){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(5);
            list.add(8);
            list.add(7);

            System.out.print("Arraylist: "+list+"\n");
            int left=0;
            int right=list.size()-1;
            while(left<right){
                int temp=list.get(left);
                list.set(left,list.get(right));
                list.set(right,temp);
                right--;
                left++;
            }
            System.out.print("Reversed Arrylist: "+list);

        }


}

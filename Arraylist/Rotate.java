package Arraylist;

import java.util.ArrayList;
import java.util.*;
public class Rotate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(7);
        System.out.print("Arraylist: " + list + "\n");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int kkk=s.nextInt();
        kkk=kkk%list.size();

        Collections.reverse(list);
        Collections.reverse(list.subList(0,kkk));
        Collections.reverse(list.subList(kkk,list.size()));

        System.out.print("Rotated Arraylist: "+list);
    }
}

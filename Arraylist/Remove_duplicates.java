package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Remove_duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(6);

        List<Integer> duplicates = findDuplicates(list);
        System.out.println("Duplicate elements: " + duplicates);
    }

    public static List<Integer> findDuplicates(ArrayList<Integer> list) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && !duplicates.contains(list.get(i))) {
                    duplicates.add(list.get(i));
                }
            }
        }
        return duplicates;
    }
}

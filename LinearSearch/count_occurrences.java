package LinearSearch;

import java.util.Scanner;

public class count_occurrences {
    public static void main(String[] args) {
        String input="occurrences";
        Scanner s=new Scanner(System.in);
        System.out.print("Enter character:");
        char ch=s.next().charAt(0);
        int count=0;
        for(int i=0;i<input.length();i++){
            if(ch==input.charAt(i)){
                count++;
            }
        }
        System.out.println("count :"+count);

    }
}

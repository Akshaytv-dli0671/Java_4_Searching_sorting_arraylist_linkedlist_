package LinearSearch;

public class MaxElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 11, 8, 9};
        int max=Max_element(array);
        System.out.println("Maximum element "+max);

    }

    public static int Max_element(int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }
}

package Assignment;

public class occurence_of_element_in_array {
    public static void main(String[] args) {
        int[] arr = {5,4,6,77,4,5,6,5};
        int count = 0;
        int value = 77;

        for (int j : arr) {
            if (j == value) {
                count++;
            }
        }

        System.out.println(count);
    }
}

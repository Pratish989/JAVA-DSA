// Q - Check if the array is sorted or not?


package Assignment;

public class check_if_array_sorted {
    public static void main(String[] args) {
        int[] arr = {5,4,6,77,4,5,6,5};
        boolean check = true;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                check = false;
                System.out.println("array is not sorted ");
                break;
            }
        }
    }
}

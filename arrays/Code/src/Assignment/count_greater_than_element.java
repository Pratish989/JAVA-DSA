// Q - Count the number of elements strictly greater than value of x

package Assignment;

public class count_greater_than_element {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,5,6,5,3,6,8,9};
        int value = 5;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 5){
                count++;
            }
        }
        System.out.println(count);
    }
}

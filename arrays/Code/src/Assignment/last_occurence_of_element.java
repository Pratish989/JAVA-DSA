// Q - Find the last occurrence of an element x in an array


package Assignment;

public class last_occurence_of_element {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,5,6,5,3,6,8,9};
        int value = 5;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                lastIndex = i;
            }
        }

        System.out.println(lastIndex);
    }
}

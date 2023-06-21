package Assignment;

public class maxvalueinarray {
    public static void main(String[] args) {
        int[] array = {10,3,4,5,6,8,5};
        int max = 0;

        for(int i =0; i < array.length; i ++){
            if(array[i] > max){  // comparing current value with the max value we have already defined.
                max = array[i];
            }
        }

        System.out.println("MAX is: " + max);
    }
}

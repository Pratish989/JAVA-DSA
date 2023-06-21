package intermediate_coding;

import java.util.Scanner;

public class RepeatingNumber {
    static int firstRepeatingNumber(int[] arr){
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        return arr[i];
                    }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SIze fo the ARRAY: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }

        System.out.println("First Repeating Number:  " + firstRepeatingNumber(arr));
    }
}

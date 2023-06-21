// Sort any array consisting of 0s and 1s without using sort method

package Two_Pointers;

import java.util.Arrays;
import java.util.Scanner;

public class sort_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");

        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }

        countZeroesAndOnesInPlace(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a, int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }


//    static void countZeroesAndOnes(int[] arr){
//        int n = arr.length;
//
//        int zeroes = 0;
//
//        for (int i = 0; i < n; i++) {
//            if(arr[i] == 0){
//                zeroes++;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if(i< zeroes){
//                arr[i] = 0;
//            }else {
//                arr[i] = 1;
//            }
//
//        }
//    }
        static void countZeroesAndOnesInPlace (int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
            while(left< right) {
                if(arr[left] == 1 && arr[right] == 0){
                    swap(arr,left,right);
                    left++;
                    right--;
                }

                if(arr[left] == 0){
                    left++;
                }
                if(arr[right] == 1){
                    right--;
                }

            }




        }
    
    

}

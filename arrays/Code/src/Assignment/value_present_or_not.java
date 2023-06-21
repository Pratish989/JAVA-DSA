package Assignment;

public class value_present_or_not {
    public static void main(String[] args) {
        int[] arr =  {1,5,3,6,7,9,3};
        int value = 9;
        int ans = -1;


        for (int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                ans = i; // if we don't write break keyword then we can get different answer because the value of 3 is coming twice
                break; // after we have find the first index of the value then we can break the loop.
            }
        }

        if(ans == -1){
            System.out.println("value not found");
        } else {
            System.out.println(value + " is present at this place : " +  ans);
        }
    }
}

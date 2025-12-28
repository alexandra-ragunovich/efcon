package Module2.task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int nums[] = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(20);
        }
        System.out.print("Array: " + Arrays.toString(nums));
        for (int i=0;i<nums.length/2;i++){
            int first=nums[i];
            int second=nums[nums.length-1-i];
            nums[i]=second;
           nums[nums.length-1-i]=first;
        }
        System.out.print("\nArray: " + Arrays.toString(nums));
    }
}
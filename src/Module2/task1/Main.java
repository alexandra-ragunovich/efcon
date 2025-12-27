package Module2.task1;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int nums[] = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(20);
        }
        System.out.print("Array: " + Arrays.toString(nums));

        int max = nums[0];
        int imax = 0;
        for (int i=0; i<nums.length;i++)
        {
            if(max<nums[i]){
                max=nums[i];
                imax=i;
            }
        }
        System.out.print("\nMax element:"+max+"\nIndex:"+imax);
    }
}

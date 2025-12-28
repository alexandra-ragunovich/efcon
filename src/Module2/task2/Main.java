package Module2.task2;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(20);
        }
        System.out.print("Array: " + Arrays.toString(nums));
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        ArrayList<Integer> iMin= new ArrayList<>();
        ArrayList<Integer> iMax = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == min) iMin.add(i);
            if (nums[i] == max) iMax.add(i);
        }
        int maxDiff = 0;
        int minIndRes=0;
        int maxIndRes=0;
        for (int i=0;i<iMax.size();i++) {
          for (int j=0;j<iMin.size();j++){
            int diff=Math.abs(iMax.get(i) - iMin.get(j));
            if(diff>maxDiff){
                maxDiff = diff;
                minIndRes = iMin.get(j);
                maxIndRes = iMax.get(i);
            }
        }
        }
        if (minIndRes < maxIndRes) {
            for (int i = minIndRes + 1; i < maxIndRes; i++){
                sum += nums[i];
            }
        } else {
            for (int i = maxIndRes + 1; i < minIndRes; i++) {
                sum += nums[i];
            }
        }
        System.out.printf("\nСумма между максимальным элементом %d с индексом %d и минимальным элементом %d с индексом %d равна %d", nums[maxIndRes], maxIndRes, nums[minIndRes], minIndRes, sum);
    }

}
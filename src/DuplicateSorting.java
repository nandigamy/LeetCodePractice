import java.util.Arrays;

public class DuplicateSorting {


    public boolean hasDuplicateSorting(int[] nums){

         Arrays.sort(nums);

         for ( int i=0; i<nums.length-1; i++){
             if (nums[i] == nums[i+1])
             {
                     return true;
             }

         }

        return false;
    }
}



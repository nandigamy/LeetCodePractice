import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NumbersDisappeared {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();



        for ( int i=0; i<nums.length; i++){

                int temp = Math.abs(nums[i]);
                if(nums[temp-1]>0) {
                    nums[temp - 1] = -nums[temp - 1];
                }


        }

        for( int i=0; i<nums.length; i++){
            if(nums[i]>0){
                result.add(i+1);

            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Disappeared numbers " + findDisappearedNumbers(new int[] {1, 1, 1}));
    }
}

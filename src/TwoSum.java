import java.util.Arrays;

public class TwoSum {

     int[] numArr = new int[2];
    public  int[] twoSum(int[] nums, int target) {
   for ( int i=0; i<nums.length; i++){
       int temp= target-nums[i];
       for ( int j=1; j<nums.length && i!=j; j++){
           if(nums[j]==temp){
               numArr[0]=i;
               numArr[1]=j;
           }
       }
   }

        return numArr;
    }

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        System.out.println("twosum  " + Arrays.toString(t.twoSum(new int[]{3,3}, 6)));
    }
}

import java.util.Arrays;

public class MaxProdDiff {

    public static int maxProductDifference(int[] nums) {
//        Arrays.sort(nums);
//

//
//        return ((nums[n-1]*nums[n-2])- (nums[0]*nums[1]));
        int n= nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int min1= Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;

        for ( int i=0; i<n; i++){
            if(nums[i]>max1){
                max2= max1;
                max1= nums[i];
            } else if( nums[i]>max2){
                max2= nums[i];
            }

            if(nums[i]<min1){
                min2= min1;
                min1= nums[i];
            } else if ( nums[i]< min2){
                min2= nums[i];
            }
        }

        return max1*max2- min1*min2;
    }

    public static void main(String[] args) {

        System.out.println("max prod diff "+ maxProductDifference(new int[] {4,2,5,9,7,4,8}));

    }
}

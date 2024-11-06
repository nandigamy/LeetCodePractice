public class MonotonicArray {

    public  static boolean isMonotonic(int[] nums) {


        int n= nums.length;


        boolean isIncreasing =true;
        boolean isDecreasing=true;
        for( int i=0;i<n-1;i++){

            if(!( nums[i]<=nums[i+1])){
                isIncreasing=false;


            }
            if(!( nums[i]>=nums[i+1])){
                isDecreasing=false;


            }
            if (!isIncreasing && !isDecreasing) {
                return false;
            }


        }



        return true;

    }

    public static void main(String[] args) {
        System.out.println("ismonotonic "+ isMonotonic(new int[]{1,3,5,5}));
    }
}

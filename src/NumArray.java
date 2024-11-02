public class NumArray {

    private int[] prefixSums;
    public NumArray(int[] nums) {

        this.prefixSums  = new int[nums.length+1];

        for ( int i=0;i<nums.length;i++)
        {
            prefixSums[i+1]=prefixSums[i]+nums[i];
        }
    }






    public int sumRange(int left, int right) {


        return prefixSums[right + 1] - prefixSums[left];

    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 0, 3, -5, 2, -1}; // Example array
        NumArray numArray = new NumArray(nums1);

        // Test sumRange with different ranges
        System.out.println("Sum from index 0 to 2: " + numArray.sumRange(0, 2)); // Expected output: 1
        System.out.println("Sum from index 2 to 5: " + numArray.sumRange(2, 5)); // Expected output: -1
        System.out.println("Sum from index 0 to 5: " + numArray.sumRange(0, 5)); //
    }
}

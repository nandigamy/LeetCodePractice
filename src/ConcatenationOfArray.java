public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int[] nums2 = new int[nums.length*2];

        System.arraycopy(nums, 0, nums2, 0, nums.length);

        System.arraycopy(nums, 0, nums2, nums.length + 0, nums.length);

        return nums2;
    }
}

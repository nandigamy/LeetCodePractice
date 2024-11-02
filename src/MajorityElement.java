public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int count =0;
        int candidate=nums[0];
        for ( int i=0; i<nums.length; i++){

            if(nums[i]==candidate){
                count++;
            }
            else {
                count--;
            }
            if(count==0)
            {
                candidate=nums[i];
                count++;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println("Majirity numner is " + majorityElement(new int[] {3, 3, 4}));
    }

}

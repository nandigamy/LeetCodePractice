public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
        int k=0;

        for ( int i=0; i<nums.length; i++){
                if(nums[i]!=val){
                    nums[k]=nums[i];
                    k++;
                }
            }


        return k;
    }

    public static void main(String[] args) {

       System.out.println("value" + removeElement(new int[] {1,2,2,3,4,2}, 2));
    }

}

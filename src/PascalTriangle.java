import java.util.List;

public class PascalTriangle {

    public  static List<List<Integer>> generate(int numRows) {
int j=0;
while ( j<numRows) {
    for (int i = 0; i < numRows-1; i++) {

        System.out.print(i + j+ " ");
    }
    j++;
}
        return List.of();
    }

    public static int[] generatePascal(int[] nums){


        for ( int i=0; i<nums.length-1; i++)
        {

            System.out.print(nums[i] + nums[i+1]+ " ");
        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.println("pascal traingle. " + generate(3));

        System.out.println("pascal traingle gebaret. " + generatePascal(new int[] {1,1}));
    }
}

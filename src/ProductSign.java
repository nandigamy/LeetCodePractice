import java.math.BigDecimal;

public class ProductSign {

    public static int arraySign(int[] nums) {


      int nCount=0;
        for ( int n: nums) {

            if (n == 0) {
                return 0;
            } else if (n <0) {
                nCount++;
            }
        }
            if(nCount%2==0){
                return 1;
            }
            else{
                return -1;
            }





    }

    public static void main(String[] args) {
        System.out.println("ArraySign "+ arraySign(new int[]{-1,-2,-3,-4,3,2,1}));
    }

}

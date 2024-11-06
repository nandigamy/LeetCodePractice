public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count=0;
        int k= flowerbed.length;
        int i=1;
        if(k==1 ){
            if(flowerbed[0] == 0)  count++;
            return count>=n;
        }
        if(k==2){
            if(flowerbed[0] == 0 &&flowerbed[1] == 0) count++;


            return count>=n;
        }


            if (flowerbed[i] == 0 && flowerbed[i-1] == 0) {
                flowerbed[i-1]=1;
                count++;
            }
            if (flowerbed[k - 1] == 0 && flowerbed[k - 2] == 0 ) {
                flowerbed[k-1]=1;
                count++;
            }

        while(  i<k-1){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 &&flowerbed[i+1]==0){
               flowerbed[i]=1;
                count++;
                i=i+2;
            }
            else {
                i++;
            }
        }

            return count>=n;

    }

    public static void main(String[] args) {
        System.out.println("canPlaceFlowers. "+canPlaceFlowers(new int[] {1},0));


    }
}

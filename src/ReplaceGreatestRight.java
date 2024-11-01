import java.util.Arrays;

public class ReplaceGreatestRight {

    public int[] replaceElements(int[] arr) {

        int n = arr.length;

//
//    for ( int i=1; i<n; i++){
//
//        arr[i-1]=findMax(Arrays.copyOfRange(arr,i,n));
//    }

    arr[0]= findMax(Arrays.copyOfRange(arr,1,n));

   if( arr[n-2]< arr[n-1]) {
       arr[n - 2] = arr[n - 1];
   }

   if( arr[n-3]<arr[n-2]){
       arr[n - 3] = arr[n - 2];
   }



    arr[n-1]=-1;
    return arr;
    }

    public int findMax (int[] arr1) {

        int max = arr1[0];

        for ( int i=1; i< arr1.length; i++){
            if(arr1[i]>max){
                max= arr1[i];
            }
        }
        return max;


    }


}


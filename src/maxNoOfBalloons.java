import java.util.stream.IntStream;

public class maxNoOfBalloons {

    public static int maxNumberOfBalloons(String text) {

        int[] counts = new int[26];

   for( char c: text.toCharArray()){
       int charIndex= c- 'a';
       counts[charIndex]++;
   }

     for ( int i=0; i< counts.length; i++){
         if(counts[i]>0){
             System.out.println((char)(i + 'a') + ": " + counts[i]);
         }
     }

     int bCount =counts['b'- 'a'];
     int aCount = counts['a'- 'a'];
     int lCount = counts['l'- 'a']/2;
     int oCount = counts['o'- 'a']/2;
     int nCount = counts[ 'n' - 'a'];

        int maxBalloons = IntStream.of(bCount, aCount, lCount, oCount, nCount).min().orElse(0);


        return maxBalloons;
    }

    public static void main(String[] args) {
        System.out.println("maxNumberOfBalloons "+  maxNumberOfBalloons("loonballxballpoon"
        ));
    }
}

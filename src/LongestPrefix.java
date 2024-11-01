public class LongestPrefix {

    public  static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";
       // String minLengthOne= MinLengthString(strs);
        String prefix = strs[0];

        for ( int i=1; i< strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                }


        }
        if (prefix.isEmpty()) {
            return "";
        }


        return prefix;
    }

    public static String MinLengthString(String[] strs1){

        String minL = strs1[0];
        for ( int i=1; i< strs1.length; i++){

            if( minL.length()> strs1[i].length()){
                minL= strs1[i];
            }

        }

        return minL;
    }

    public static void main(String[] args) {

      System.out.println("longest prefix. " + longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}

public class IndexSubString {

    public static int strStr(String haystack, String needle) {

        int index = haystack.indexOf(needle);


        if (index != -1) {
            return index;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("index "+ strStr("leetcode", "leeto"));
    }
}

package com.nandi.twopointers;

public class FindNextPalindrome {
    
    public static String findNextPalindrome(String num) {
        
        if (num.length() % 2 != 0) {
            String numLeft = num.substring(0, num.length() / 2);
            System.out.println("Left Half: " + numLeft);
            
            // Convert numLeft to a mutable char array
            char[] ch = numLeft.toCharArray();
            int j = numLeft.length() - 1;
            
            while (j > 0) { // Fix: Avoid out-of-bounds error
                if (ch[j] > ch[j - 1]) {
                    swap(ch, j - 1, j);
                    break; // Fix: Avoid infinite swapping
                }
                j--;
            }
            
            String rightHalf = "";
            int temp = Integer.parseInt(numLeft); // Convert to integer
            
            while (temp != 0) {
                rightHalf = rightHalf + (temp % 10); // Convert properly
                temp = temp / 10; // Fix: Use division instead of modulo
            }
            
            return numLeft + num.charAt(num.length() / 2) + rightHalf;
        }

        return "";
    }
    
    // Swap function for a char array
    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println(findNextPalindrome("12321")); // Example test case
    }
}


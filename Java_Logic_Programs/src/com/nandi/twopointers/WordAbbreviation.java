package com.nandi.twopointers;

public class WordAbbreviation {
    public static boolean validWordAbbreviation(String word, String abbr) {
        char[] w = word.toCharArray();
        char[] ab = abbr.toCharArray();
        
        int i = 0, j = 0;

        while (i < w.length && j < ab.length) {
            if (Character.isLetter(ab[j])) {
                if (i >= w.length || w[i] != ab[j]) {
                    return false;
                }
                i++;
                j++;
            } else if (Character.isDigit(ab[j])) {
                if (ab[j] == '0') return false; // Leading zeros are not allowed

                StringBuilder numStr = new StringBuilder();
                while (j < ab.length && Character.isDigit(ab[j])) {
                    numStr.append(ab[j]);
                    j++;
                }

                int n = Integer.parseInt(numStr.toString());
                if (i + n > w.length) return false; // Prevent skipping beyond word length
                i += n; // Move pointer forward
            } else {
                return false;
            }
        }

        return i == w.length && j == ab.length;
    }

    public static void main(String[] args) {
        System.out.println(validWordAbbreviation("internationalization", "13iz4n")); // true
        System.out.println(validWordAbbreviation("apple", "a2e")); // false
        System.out.println(validWordAbbreviation("substitution", "s10n")); // true
        System.out.println(validWordAbbreviation("substitution", "s010n")); // false (leading zero)
        System.out.println(validWordAbbreviation("z", "2")); // false (fix applied)
    }
}


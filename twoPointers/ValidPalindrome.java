package twoPointers;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

    public static void main(String args[]) {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "a.";
        String s = "0P";
        System.out.println(validPalindrome_optimized(s));
    }

    private static boolean validPalindrome_own(String s) {
        int i = 0;
        List<Character> chars = new ArrayList<>();
        if (s.length() == 1) {
            return true;
        }
        for (int k = 0; k < s.length(); k++) {
            if (Character.isLetter(s.charAt(k)) || Character.isDigit(s.charAt(k))) {
                chars.add(Character.toLowerCase(s.charAt(k)));
            }
        }

        int j = chars.size() - 1;
        while (i < j) {
            if (chars.get(i) != chars.get(j)) {
                System.out.println("not a palindrome");
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    // ---------------------------------------------<>-----------------------------------------

    public static boolean validPalindrome_optimized(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            // Move i forward if not alphanumeric
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // Move j backward if not alphanumeric
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

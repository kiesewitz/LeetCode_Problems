package Problem_5_LongestPalindromicSubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeSubstr {
    public static void main(String[] args) {
        String input = "baddaba";
        System.out.println(longestPalindrome(input));
    }

    public static String longestPalindrome(String s) {
        String longestSubstr = "";
        String currentSubstr = "";
        StringBuilder reverser = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            currentSubstr += s.charAt(i);
            reverser.delete(0, reverser.length());
            if (currentSubstr.charAt(0) == currentSubstr.charAt(currentSubstr.length()-1)) {
                reverser.append(currentSubstr);
            }
            if (!reverser.isEmpty() && currentSubstr.contentEquals(reverser.reverse()) && currentSubstr.length() > longestSubstr.length()) {
                longestSubstr = currentSubstr;
            }
            for (int j = i+1; j < s.length(); j++) {
                currentSubstr += s.charAt(j);
                reverser.delete(0, reverser.length());
                if (currentSubstr.charAt(0) == currentSubstr.charAt(currentSubstr.length()-1)) {
                    reverser.append(currentSubstr);
                }
                if (!reverser.isEmpty() && currentSubstr.contentEquals(reverser.reverse()) && currentSubstr.length() > longestSubstr.length()) {
                    longestSubstr = currentSubstr;
                }
            }
            currentSubstr = "";
        }

        return longestSubstr;
    }
}

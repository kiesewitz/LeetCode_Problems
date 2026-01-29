package Problem_5_LongestPalindromicSubstring;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeSubstr_FirstApproach {
    public static void main(String[] args) {
        String input = "cbbd";
        System.out.println(longestPalindrome(input));
    }

    public static String longestPalindrome(String s) {
        String longestSubstr = "";
        String currentSubstr = "";
        StringBuilder reverser;

        for(int i = 0; i < s.length(); i++) {
            currentSubstr += s.charAt(i);
            reverser = new StringBuilder(currentSubstr);
            if(currentSubstr.contentEquals(reverser.reverse()) && currentSubstr.length() > longestSubstr.length()) {
                longestSubstr = currentSubstr;
            }
            for (int j = i+1; j < s.length(); j++) {
                currentSubstr += s.charAt(j);
                reverser = new StringBuilder(currentSubstr);
                if(currentSubstr.contentEquals(reverser.reverse()) && currentSubstr.length() > longestSubstr.length()) {
                    longestSubstr = currentSubstr;
                }
            }
            currentSubstr = "";
        }

        return longestSubstr;
    }
}

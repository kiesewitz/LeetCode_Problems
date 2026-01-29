package Problem_3_LongestSubstringNoRepeats;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstr {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        String current = "";
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            current += s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if(!current.contains(String.valueOf(s.charAt(j)))) {
                    current += s.charAt(j);
                } else {
                    if(current.length() > max) {
                        max = current.length();
                    }
                    current = "";
                    break;
                }
            }
            if(current.length() > max) {
                max = current.length();
            }
            current = "";
        }

        if(max == Integer.MIN_VALUE) {
            max = 0;
        }
        return max;
    }
}

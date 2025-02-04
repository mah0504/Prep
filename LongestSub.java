
    import java.util.*;

    public class LongestSub {
    

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int longest = 0;
        int left = 0, right = 0;

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                longest = Math.max(longest, right - left + 1); // y ? 
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return longest;
    }



    
        public static void main(String[] args) {
            LongestSub w = new LongestSub();
            String s1 = "abcabcbb"; // output = 3
            String s2 = "pwwkew";   // output = 3
            String s3 = "bbbbb";    // output = 1
    
            System.out.println("Testcase 1: " + w.lengthOfLongestSubstring(s1));
            System.out.println("Testcase 2: " + w.lengthOfLongestSubstring(s2));
            System.out.println("Testcase 3: " + w.lengthOfLongestSubstring(s3));
        }
    
    



    
}



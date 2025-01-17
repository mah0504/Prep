
    import java.util.*;

    public class LongestSub {
    
        int maxlength, pt1;
        Map<Character, Integer> hash = new HashMap<>();
    
        public int lengthOfLongestSubstring(String s) {
            pt1 = 0;
            maxlength = s.length();
            int longest = 0;
    
            while (maxlength > 0) {
                if (pt1 + maxlength > s.length()) {
                    pt1 = 0;
                    maxlength--;
                } else {
                    String sub = s.substring(pt1, pt1 + maxlength);
                    hash.clear();
    
                    boolean hasDuplicate = false;
                    for (int i = 0; i < sub.length(); i++) {
                        if (!hash.containsKey(sub.charAt(i))) {
                            System.out.println("char à mettre : " + sub.charAt(i));
                            hash.put(sub.charAt(i), 1);
                        } else {
                            hasDuplicate = true;
                            break;
                        }
                    }
    
                    if (!hasDuplicate) {
                        longest = maxlength;
                        break;
                    }
    
                    pt1++;
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



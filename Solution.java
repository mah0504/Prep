import java.util.*;

public class Solution {
    
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> queue = new PriorityQueue<>(new StringComp()); // heap

        for ( String s : nums){
            queue.add(s);
        }

        if ( k==1 ){
            while ( queue.size()>1){
                System.out.println( "elem a supp : "+ queue.peek());
                queue.poll();
            }
            return queue.poll();
        }


        for ( int i =0 ; i<queue.size() -k ; i++){
            queue.poll(); 
        }

        return queue.poll();
    } 

    // verser la queue et renver dans une autre ? pr le bon ordre 

    private class StringComp implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() < o2.length()) {
                return -1; 
    
            } else if (o1.length() > o2.length()) {
                
                return 1; 
            } else {
                // si de mm taille comparer chaine par chaine 
    
                for ( int i =0 ; i< o1.length(); i++){
                   if (o1.charAt(i) > o2.charAt(i)) {
                        return 1;
                   } else if (o1.charAt(i) < o2.charAt(i)) { 
                        return -1;
                   }
                   // contiuer de loop sur les autres char 
                }
            }
    
            return 0;  // egaux 
        }
    }
    

    int maxlength , pt1;
    Map<Character,Integer> hash = new HashMap<>();

    public int lengthOfLongestSubstring(String s) {
        pt1=0;
        maxlength=s.length();

        while (maxlength>0 && pt1<s.length()){
            if ( pt1 +maxlength>s.length()){
                break; //break du wile ? verif 
            }else {
                String sub = s.substring(pt1,pt1+maxlength); 

                for ( int i=0 ; i<s.length();i++){
                    if ( !hash.containsKey(sub.charAt(i)) ){
                        hash.put(sub.charAt(i), 1); 
                    } else {
                        hash.clear();
                        pt1++;
                        break;
                    } 
                
                }

            }

        maxlength--;
        } 
     return maxlength;

    }


    public static void main(String[] args){
        Solution w = new Solution();
        String s1 = "abcabcbb"; // output =3 
        String s2 ="pwwkew";
        String s3  = "bbbbb"; // output =1 

        System.out.println("testcase 1 :  "+w.lengthOfLongestSubstring(s1));

    
    }

// Input: s = "abcabcbb"

// Output: 3 
    
}




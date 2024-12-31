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
    
}




import java.util.*;

public class kthLargestElem {
    
    PriorityQueue<String> queue1 = new PriorityQueue<>(new StringComp()); 

    public String kthLargestNumber(String[] nums, int k) {
        queue1.clear(); 


        for ( String s : nums){
            queue1.add(s);

            System.out.println("sneaky sneaky : " + queue1.peek()); 
        }

        while (!queue1.isEmpty()){
            
            System.out.println("pripri : "+queue1.poll()); 
        }

        for ( int i =0 ; i<k;i++){
            queue1.poll();
        }

        return queue1.poll();
    } 


    public static void main(String[] args){

        kthLargestElem w = new kthLargestElem();
        // String[] tab = {"3","6","7","10"}; 
        // int i1= 4;
        // String[] nums = {"2","21","12","1"};
        // int i2= 3;
        // String[] nums2 = {"0","0"};
        // int i3= 2;
        // System.out.println( "the "+ i1 +"largest element is " + w.kthLargestNumber(tab, i1));
        // System.out.println( "the "+ i2 +"largest element is " + w.kthLargestNumber(nums, i2));
        // System.out.println( "the "+ i3 +"largest element is " + w.kthLargestNumber(nums2, i3));

        
        // String[] tab = {"1","0","0"};
        String[] wesh = {"423","521","2","42"}; 
        int k=2;

        System.out.println("largest nbr : "+w.kthLargestNumber(wesh, k));

    }


    private class StringComp implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() < o2.length()) {
                return 1; 
    
            } else if (o1.length() > o2.length()) {
                
                return -1; 
            } else {
                // si de mm taille comparer chaine par chaine 
    
                for ( int i =0 ; i< o1.length(); i++){
                   if (o1.charAt(i) > o2.charAt(i)) {
                        return -1;
                   } else if (o1.charAt(i) < o2.charAt(i)) { 
                        return 1;
                   }
                   // contiuer de loop sur les autres char 
                }
            }
    
            return 0;  // egaux 
        }
    }
    
}




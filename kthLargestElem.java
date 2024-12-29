import java.util.*;

public class kthLargestElem {
    
    PriorityQueue<String> queue = new PriorityQueue<>(new StringComp()); // heap

    

    // sinn comparer le ASCII si num diff ? mais taille equi 

    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> queue = new PriorityQueue<>(new StringComp()); // heap

     
        // ajout dans la queue 
        for ( String s : nums){
            queue.add(s);
        }


        // while (!queue.isEmpty()) {
        //     System.out.println(queue.poll());
        // }

        for ( int i =0 ; i<queue.size() -k ; i++){
            queue.poll(); 
        }

        
        return queue.poll();
    } 


    public static void main(String[] args){

        kthLargestElem w = new kthLargestElem();
        String[] tab = {"3","6","7","10"}; 

        int i1= 4;

        String[] nums = {"2","21","12","1"};
        int i2= 3;

        String[] nums2 = {"0","0"};
        int i3= 2;


        System.out.println( "the "+ i1 +"largest element is " + w.kthLargestNumber(tab, i1));

        System.out.println( "the "+ i2 +"largest element is " + w.kthLargestNumber(nums, i2));

        System.out.println( "the "+ i3 +"largest element is " + w.kthLargestNumber(nums2, i3));

    }


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




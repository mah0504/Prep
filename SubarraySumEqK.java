public class SubarraySumEqK {

    int counter = 0;
    int diff;
    int pointer1;
    public int subarraySum(int[] nums, int k) {

        while ( pointer1 <nums.length-1){
            System.out.println("pointer atteint index  : "+pointer1);
            
            diff = k - nums[pointer1] ; // nbr recherché 

            System.out.println("Difference atteinte : " + diff);

            if ( diff == 0){
                counter++;
                System.out.println("Compteur atteint: "+counter);

            } 

            // val suiv 
            else if( nums[pointer1+1] >diff){

                break; // subarray invalide passer au suivant 
            }
            else {
                diff -=( nums[pointer1+1] ); // decrem la val qu'on vient de trv 
            }

            pointer1 ++; 
        }

        return counter ;
    }


    public static void main(String[] args ){

        SubarraySumEqK arr = new SubarraySumEqK(); 
        int[] tab0 = {1,1,1};
        System.out.println(arr.subarraySum(tab0, 2));

    }
}

public class SubarraySumEqK {

    int counter = 0;
    int pointer1=0 ;
    int pointer2= pointer1;


    public int subarraySum(int[] nums, int k) {
        int diff=k;
        
        while ( pointer2 <nums.length){

            // System.out.println("pointer atteint index  : "+pointer1);

            diff = diff - nums[pointer2] ; //  nbr recherché 
            System.out.println( "nbr soustrait "+nums[pointer2]);
            System.out.println("la difference = "+ diff);

            // System.out.println("Difference atteinte : " + diff); //1 

            if ( diff == 0){
                counter++; 
                System.out.println("Compteur atteint quand diff egale : "+counter);
                // pointer2 ++;
                diff=k;
                pointer1 =pointer2;

            } 

            // val suiv 
            // nums[pointer2+1] >
            else if( diff<0){ 

                pointer1++; 
                pointer2=pointer1; 
                break; // subarray invalide passer au suivant 
            }

            if (pointer2 <nums.length-1){
                pointer2 ++; 
                System.out.println("nbr suivant "+nums[pointer2]);

            } else {
                
                break;
            }

        }

        
        return counter ;
    }


    public static void main(String[] args ){

        SubarraySumEqK arr = new SubarraySumEqK(); 
        int[] tab0 = {1,2};
        System.out.println(arr.subarraySum(tab0, 3));

    }
}

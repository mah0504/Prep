public class SubarraySumEqK {

    int counter = 0;
    int diff;
    int pointer1;
    public int subarraySum(int[] nums, int k) {



        // 1 1 1   pointer1 = 0   numsleng = 2
        // 2 pointeurs initialement on increm le p2 si contrad on increm p1 
        // et p2 revient a ce p1

        while ( pointer1 <nums.length-1){
            System.out.println("pointer atteint index  : "+pointer1);

            diff = k - nums[pointer1] ; // nbr recherché 

            System.out.println("Difference atteinte : " + diff); //1 

            if ( diff == 0){
                counter++;
                System.out.println("Compteur atteint quand diff egale : "+counter);


                System.out.println(" valeur suivante : "+ nums[pointer1+1]);


            } 

            // val suiv 
            else if( nums[pointer1+1] >diff){ 

                
                break; // subarray invalide passer au suivant 
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

public class SubarraySumEqK {

    int ctr = 0;
    int ptr1=0 ;
    int diff;
    int ptr2= ptr1; // cas init 


    public int subarraySum(int[] nums, int k) { 
        diff = k; 

        while ( ptr2 <nums.length){ 
   
            if ( nums[ptr2]==k ){
                ctr ++ ; // incrm compteur 
                ptr1 ++; // incrm le ptr1 aussi   
            }


            if ( nums[ptr2]>k){ 
                ptr1++; 
                ptr2= ptr1; // rev cas init ? 
                break; 

            }

            else {

                // cas subarray

                diff -= nums[ptr2];  // diff = 2 -1 =1 
                
                // variable difference  ? 
                if ( diff ==0){
                    ctr++; 
                    ptr1 ++;
                    ptr2= ptr1;
                    break; // pas d'increm de p2 apres


                }
            }

            ptr2++; 
            // cas dernier increment ? 

        }

        
        return ctr ;
    }


    public static void main(String[] args ){

        SubarraySumEqK arr = new SubarraySumEqK(); 


        int[] tab1={1,1,1};
        int[] tab2= {1,2,3};
        int k1 = 2; 
        int k2=3;
        System.out.println("test case 1 : "+arr.subarraySum(tab1, k1));
        System.out.println("test case 2 : "+arr.subarraySum(tab2, k2));


        // Input: nums = [1,2,3], k = 3     // output = 2 
        // Input: nums = [1,1,1], k = 2     // output = 2
    }
}

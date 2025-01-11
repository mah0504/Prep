public class Solution1 {
 
    int[]tab;
    // public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
    // }
    
    public boolean judgeCircle(String moves) {
        int position = 0;
        
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L': position++; break;
                case 'R': position--; break;
                case 'U': position+=10; break;
                case 'D': position-=10; break;
            }
        }
        return position==0;
    }


    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] answer = new int[nums.length];
        // verif que la longueur des deux tableaux sont egales 
        for ( int i =0; i<queries.length; i++){
            int s =0;


            System.out.println("nums "+  nums[i] + " query value "+  queries[i][0]);
            System.out.println("index modifie si bas : "+queries[i][1] );
            nums[queries[i][1]] = nums[queries[i][1]]+queries[i][0]; 

            for ( int k =0 ; k<nums.length;k++){
                if ( nums[k]%2==0){
                    s +=nums[k];
                }

            }
            answer[i]=s; // nv val

        }

        // for ( int c : answer){ 
        //     System.out.println(c);
        // }
        return answer;
        
    }

    // public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
    //     int[] answer = new int[queries.length];
    //     int savedSum = 0;
    
    //     // Calcul initial de la somme des nombres pairs dans nums
    //     for (int num : nums) {
    //         if (num % 2 == 0) {
    //             savedSum += num;
    //         }
    //     }
    
    //     // Traitement des requêtes
    //     for (int i = 0; i < queries.length; i++) {
    //         int val = queries[i][0];
    //         int index = queries[i][1];
    
    //         // Vérifiez si nums[index] était pair avant la mise à jour
    //         if (nums[index] % 2 == 0) {
    //             savedSum -= nums[index];
    //         }
    
    //         // Mettez à jour nums[index]
    //         nums[index] += val;
    
    //         // Vérifiez si nums[index] est maintenant pair après la mise à jour
    //         if (nums[index] % 2 == 0) {
    //             savedSum += nums[index];
    //         }
    
    //         // Stockez la somme actuelle des nombres pairs dans answer[i]
    //         answer[i] = savedSum;
    //     }
    
    //     return answer;
    // }
    



    // Example 1:

    // Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
    // Output: [8,6,2,4]
    // Explanation: At the beginning, the array is [1,2,3,4].
    // After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
    // After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
    // After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
    // After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
    



    public static void main(String[] args){
        Solution1 w = new Solution1();
        int[] nums1 = {1,2,3,4};
        int[][] q1 = {{1,0},{-3,1},{-4,0},{2,3}};
        System.out.println( "1 " + q1.length); // longueur 
        System.out.println("2q" + q1[0].length); // largeur 
        System.out.println(" testcase 1 :  "+w.sumEvenAfterQueries(nums1,q1));
        // expected answer: [8,6,2,4]


    }


}

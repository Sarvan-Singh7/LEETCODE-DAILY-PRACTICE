class Solution {  //NEED UNIQUE TRIPLESTS AND IN THAT ONE TRIPLET NO ELEMENT FORM SAME INDEX NOT BE TAKEN TWICE  O(nSquare)
    public List<List<Integer>> threeSum(int[] nums) {  //== o(N2) but still not work proper
        int n= nums.length;
        Arrays.sort(nums);   //upar hi sort kar liya so no neeed to sort in between loops.
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i >0 && nums[i] == nums[i-1]){  ///so that we do not take first element twic
                continue;
            }
            int j=i+1;
            int k = n-1;
            while(j<k){
                int sum =nums[i] + nums[j] + nums[k];
                if(sum <0){j++;}
                else if(sum >0){k--;}
                else{    //means we got uniqu triplet where sum =0 and we do not nee to sort as full array is sorted above
                    List<Integer> helper = new ArrayList<>();
                    helper.add(nums[i]);helper.add(nums[j]);helper.add(nums[k]);
                    answer.add(helper);
                    j++;       ///when finded pair then shrink from both ends so that not duplicate in another triplet
                    k--;
                    while(j<k && nums[j] == nums[j-1]){j++;}///j<k here and on below means on both are important
                    while(j<k && nums[k] == nums[k+1]){k--;}//both while loop so that we do not take j th and k th elementtwice

                }
            }
        }
        return answer;
        //compare with k+1  
    }
}



// class Solution {  //NEED UNIQUE TRIPLESTS AND IN THAT ONE TRIPLET NO ELEMENT FORM SAME INDEX NOT BE TAKEN TWICE  O(nSquare)
//     public List<List<Integer>> threeSum(int[] nums) {  //== o(N2) but still not work proper
//         int n= nums.length;
//         Set<List<Integer>> set = new HashSet<>();  ///set so that no  1D duplicate arraylist
//         for(int i=0;i<n;i++){
//             Set<Integer> helperSet = new HashSet<>();   //so that no duplicate elementsin one single triplet
//             for(int j=i+1;j<n;j++){
//                 int third = -(nums[i] + nums[j]);
//                 if(helperSet.contains(third)){
//                   List<Integer> triplet = Arrays.asList(nums[i], third, nums[j]);
//                   Collections.sort(triplet);
//                   set.add(triplet);
//                 }

//                 helperSet.add(nums[j]);
//             }
//         }
//         return new ArrayList<>(set);
        
//     }
// } 

   


// class Solution {  //NEED UNIQUE TRIPLESTS AND IN THAT ONE TRIPLET NO ELEMENT FORM SAME INDEX NOT BE TAKEN TWICE
//     public List<List<Integer>> threeSum(int[] nums) {  //== o(N3)
//         int n= nums.length;
//         List<List<Integer>> arr = new ArrayList<>();
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums[i] + nums[j] + nums[k] == 0){
//                         List<Integer> helper = new ArrayList<>();//below SORTING TAKES CONSTANT TIME AS 3 ELEMENTS ONLY
//                         helper.add(nums[i]);helper.add(nums[j]);helper.add(nums[k]);
//                         Collections.sort(helper);  //sort isliye kar liya ki easy check ho jaye ki same element wala pehle se present toh nahin
//                         if(!arr.contains(helper)){  //for unique triplets
//                             arr.add(helper);
//                         }
                        
//                     }
//                 }
//             }
//         }
//         return arr;
//     }
// } 
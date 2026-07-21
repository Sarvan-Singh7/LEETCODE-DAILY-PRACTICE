// class Solution {  /////O(n * (totalSum - maximum value))  ~ nearby Quad so wont work TLE when to travel all
//     public static int check(int nums[], int capacity){
//         int days = 1;
//         int sum =0;
//         for(int i=0; i< nums.length; i++){
//             sum += nums[i];
//             if(sum <= capacity){
//                 continue;
//             }
//             else{
//                 sum =0;
//                 sum += nums[i];
//                 days++;
//             }
//         }
//         return days;
//     }
//     public int shipWithinDays(int[] weights, int days) {
//         int totalSum =0;
//         int maxi =0;
//         for(int i=0; i<weights.length; i++ ){
//             int val = weights[i];
//             totalSum += val;
//             maxi = Math.max(maxi, val);
//         }

//         ///min value of range = maximum value as agar first example mein 9 caacity li toh 10 kaise ayega
//         //max value of range =  sum of all as so can ship all in 1 day itself

//         for(int i = maxi; i<= totalSum; i++){
//             if(check(weights, i) <= days){
//                 return i;
//             }
//         }
//         return totalSum;

//     }
// }

class Solution {
    public static int check(int nums[], int capacity){ //helper function to check that days needed for given capacity
        int days = 1;
        int sum =0;
        for(int i=0; i< nums.length; i++){
            sum += nums[i];
            if(sum <= capacity){
                continue;
            }
            else{
                sum =0;
                sum += nums[i];
                days++;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int totalSum =0;
        int maxi =0;
        for(int i=0; i<weights.length; i++ ){
            int val = weights[i];
            totalSum += val;
            maxi = Math.max(maxi, val);
        }

        ///min value of range = maximum value as agar first example mein 9 caacity li toh 10 kaise ayega
        //max value of range =  sum of all as so can ship all in 1 day itself

        int i = maxi, j = totalSum;
        int answer =0;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(check(weights, mid) <= days){
                answer = mid;
                j= mid -1;
            }
            else{
                i = mid +1;
            }
        }
        return answer;

    }
}
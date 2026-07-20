// class Solution {   O(Math.max(arr[i]) * n) so quadratic type so not run
//     public static int check(int arr[], int hourly){
//         long totalHours =0;   //long as big Integer value may overflow on add
//         for(int val : arr){
//             totalHours +=  (int)Math.ceil((double)val/hourly); ////double agar nahin diya so wrong answer;
//         }
//             // Cast it back to int or change the function return type to long
//         // If totalHours exceeds Integer.MAX_VALUE, cap it so it doesn't break
//         if (totalHours > Integer.MAX_VALUE) {
//             return Integer.MAX_VALUE;
//         }
//         return (int)totalHours;
//     }
//     public int minEatingSpeed(int[] piles, int h) {
//         int n = piles.length;
//         int countHour = 0;
//         int maxi =0;
//         for(int i=0;i<n;i++){
//             maxi = Math.max(maxi, piles[i]);
//         }
//         for(int i=1; i<= maxi; i++){ //as k lies in between 1 and maxi inclusive
//             int hours = check(piles, i);
//             if(hours <= h){
//                 return i;
//             }
//         }
//         return maxi;
//     }
// }


class Solution {
    public static int check(int arr[], int hourly){
        long totalHours =0;   //long as big Integer value may overflow on add
        for(int val : arr){
            totalHours +=  (int)Math.ceil((double)val/hourly); ////double agar nahin diya so wrong answer;
        }
        // Cast it back to int or change the function return type to long
        // If totalHours exceeds Integer.MAX_VALUE, cap it so it doesn't break
        if (totalHours > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
 
        int maxi =0;
        for(int i=0;i<n;i++){ //calculate maximum element as range can be fro 1 to maximum element
            maxi = Math.max(maxi, piles[i]);
        }

        int i =1, j=maxi;  ///hum array oe nahin balki range ke upar BS laga rahein hai jo valid answer de sakti hai
        int answer = maxi;

        while(i<=j){
            int mid = i  + (j-i)/2;
            if(check(piles, mid) <= h){//agar mid valid hai so as hame less value of k chahiye so go left and search there
                answer = mid;
                j = mid-1;
            }
            else{     //if current is wrong choice so go right
                i= mid+1;
            }
        }
        return answer;
    }
}
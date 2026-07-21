// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int n = arr.length;
//         int maxRange = n +k;//as at max the element which will be no there is n+k  see seocnd eg 
        
//         for(int i=1; i<=maxRange; i++){
//             boolean finded = false;
//             for(int j = 0; j< n ; j++){
//                 if(i == arr[j]){
//                     finded = true;
//                     break;
//                 }
//             }
//             if(finded == false)k--;
//             if(k == 0)return i;
//         }
//         return -1;
//     }
// }


class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] <= k)k++;
            else break;
        }
        return k;
    }
}
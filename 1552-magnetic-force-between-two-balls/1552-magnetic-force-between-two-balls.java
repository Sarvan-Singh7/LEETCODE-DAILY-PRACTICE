class Solution {   /////EXACTLY SAME AS AGRESSIVE COWS CODE    ---
    public static boolean isPossible(int arr[], int balls, int distance){
        int n = arr.length;
        int last = arr[0];
        int ballCountPlaced =1;
        for(int i=1;i<n;i++){
            if(arr[i] - last >= distance){
                ballCountPlaced++;
                last = arr[i];//please update last as without it how will u compare
                if(ballCountPlaced >= balls){
                    return true;
                }
            }
        }

        return false;
    }
    // public int maxDistance(int[] position, int m) {   ///TLE as TC = O(n * (maxi - mini))
    //     int n = position.length;
    //     Arrays.sort(position);
    //     ///we know that distance shall start from 1 till (MAX-MIN)  as MAX- MIN is small distance
    //     int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
    //     for(int i= 0; i<n; i++){
    //         maxi = Math.max(maxi, position[i]);
    //         mini = Math.min(mini, position[i]);
    //     }
    //     ////sari values compare karenge from 1 to that value and jahan result invalid hoga waha humein pata chal jaega ki invalid answer hai
    //     ///ham yahan se minimum distance ki loop chala rahein hai and jis distance pe sari balls fit nahin ho payi woh invalid sequence hai
    //     for(int i=1; i<= (maxi- mini); i++){
    //         if(isPossible(position, m , i)){
    //             continue;
    //         }
    //         else{
    //             return i-1;
    //         }
    //     }
    //     return maxi - mini;
    // }

       public int maxDistance(int[] position, int m) {   /// TC = O(n * log(maxi - mini))
        int n = position.length;
        Arrays.sort(position);
        ///we know that distance shall start from 1 till (MAX-MIN)  as MAX- MIN is small distance
        int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
        for(int i= 0; i<n; i++){
            maxi = Math.max(maxi, position[i]);
            mini = Math.min(mini, position[i]);
        }
        ////sari values compare karenge from 1 to that value and jahan result invalid hoga waha humein pata chal jaega ki invalid answer hai
        ///ham yahan se minimum distance ki loop chala rahein hai and jis distance pe sari balls fit nahin ho payi woh invalid sequence hai
        int i = 1, j = maxi - mini;
        int answer = 0;
        while(i <= j){
            int mid = i + (j-i)/2;
            if(isPossible(position, m, mid) == true){
                answer = mid;
                i = mid +1; ///CHOTA MILA SO BADA DHUNDO
            }
            else{
                j = mid -1;  //CHOTE DISTANCE PE SHAYAD VALID HO SAKTA HAIO
            }
        }
        return answer;
    }
}
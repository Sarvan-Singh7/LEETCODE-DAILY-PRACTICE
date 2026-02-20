class Solution {//in this boolean function check if an current elemetnin fruits can be filled in greater basket[i]
    public static boolean checkFill(boolean[] arr, int target, int[] basket){
        for(int i=0;i<basket.length;i++){
            if(target <= basket[i] && arr[i] == false){  
                arr[i] = true;    //marking boolean array so that not to  take again
                return true;
            }
        }
        return false;
    }
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean arr[] = new boolean[baskets.length];
        int count=0;
        for(int i=0;i<fruits.length;i++){
            if(checkFill(arr, fruits[i], baskets) == false){   /// if found so return true
                count++;
            }
        }
        return count;
    }
}
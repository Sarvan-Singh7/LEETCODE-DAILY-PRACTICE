class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0) +1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 2){      //storing repeating element
                arr[0] = key;
                break;
            }
        }
        int n= nums.length;
        int nSum = (n * (n+1)) /2;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){     //added all to set so now i can minus all unique elements from nSum
            set.add(nums[i]);
        }
        int UniqueSum =0;
        for(int val : set){
           UniqueSum += val;
        }
        arr[1] = (nSum - UniqueSum);

        return arr;


    }
}
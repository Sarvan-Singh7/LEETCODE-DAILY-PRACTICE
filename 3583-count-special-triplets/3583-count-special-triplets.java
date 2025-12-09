class Solution {
    public int specialTriplets(int[] nums) {
        int modulo = 1_000_000_007;
        HashMap<Integer , Integer> leftCount = new HashMap<>();
        HashMap<Integer , Integer> rightCount = new HashMap<>();   //right wale hashmap ko full kar dete hai so that isko decrease bhi karte jae hun
        long answer = 0;
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
             rightCount.put(num , rightCount.getOrDefault(num , 0) + 1);
        }
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            rightCount.put(num , rightCount.get(num) - 1);   //on every iteration forward move so decrease element frequency from right hashmap
            if(rightCount.get(num) ==0){                                                           //if at any point element frequency =0 in right so remove it
                rightCount.remove(num);
            }
            long left = (leftCount.containsKey(num * 2) ) ? leftCount.get(num *2) :0;//[long used as int cannot handle such large values]                 //if left map contains num *2 so store in left variable
            long right = (rightCount.containsKey(num * 2) ) ? rightCount.get(num *2) :0;              //if right one contains so store in right variable

            answer = (answer + (long)(left * right))%modulo;             //every iteration if both left and right exists so then add only
            leftCount.put(num , leftCount.getOrDefault(num,0) + 1);                                    //as deleting from right so store in left as forward
        }
        return (int)answer ;
    }
}
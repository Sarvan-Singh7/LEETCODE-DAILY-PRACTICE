///INTERVAL DP--------------------------------
class Solution {
    public static int f(int nums[], int si, int ei){
        if(si == ei)return nums[si];   ///return nums[[si]] as it will also contribute
        int left = nums[si] - f(nums, si+1, ei); ////MINUS KIYA HAI FUNCTION KO AS PERSON1 NE GAIN KIYA NUMS[SI] KO SO - F() MEANS THAT PERSON2 TRIES TO DECREMENT THAT VALUE

        int right = nums[ei] - f(nums, si, ei-1);   ///HERE ALSO MINUS AS PLAYER2 ALSO DECREMENT HERE

        return Math.max(left, right);
    }
    ///HUME YEH PATA HAI KI PLAYER 1 AND PLAYER 2 MEIN SE WINNER DENA HAI, BUT WE DO THIS IN DIFFERENT WAY IN UPPER FUNCTION WE WILL JUST CALCULATE PERSON1 SCORE AND SUBTRACT PERSON2 SCORE FROM IT AND AT LAST IF IT RETURN +VE VALUE SO IT MEANS PERSON1 WINS AS POSITIVE SO LARGER
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        return f(nums, 0, n-1) >=0 ?true:false;
        
    }
}
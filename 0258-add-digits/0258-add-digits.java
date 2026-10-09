class Solution {
    public int addDigits(int num) {
        int answer =32;
        int sum =num;
        while(answer-- >=0){
            int n = sum;
            sum =0;
            
            while(n >0){
                int ld = n % 10;
                sum = sum+ld;
                n=n/10; 
            }
            System.out.println(sum);
            if(sum <10)return sum;

        }
        return answer;
    }
}
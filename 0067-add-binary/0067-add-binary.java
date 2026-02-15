class Solution {  
    public String addBinary(String a, String b) {
         int i=a.length() -1;
         int j = b.length() -1;
         int carry =0;
         StringBuilder sb = new StringBuilder(); // so to add sum of each 2 number
         while(i>=0 || j>=0 || carry ==1){ //carry ==1 used so as if at completion carry still exists
            int sum = carry;
            if(i>=0){
            sum += a.charAt(i)- '0';
            i--;   // also decrease index
            }
            if(j >=0){
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum %2);  // add each iteration sum to strinbuilder
            carry = sum /2;     // just divide by 2
         }
         return sb.reverse().toString(); // at last reverse also so that to get right answer;
    }
}





// class Solution {  ===NOT WORK AS DUE TO BITS INTEGER FLOW OCCURS
//     public long DecimalToBin(long n){
//         if(n==0)return 0;
//         return DecimalToBin(n/2)* 10 +(n%2);
//     }
//     public long BinToDecimal(long n){
//         if(n==0)return 0;
//         return BinToDecimal(n/10)* 2 +(n%10);
//     }

//     public String addBinary(String a, String b) {
//         long n=Integer.parseInt(a);
//         long m=Integer.parseInt(b);
//         long ans1 =BinToDecimal(n);
//         long ans2 =BinToDecimal(m);
//         long answer = ans1+ans2;
//         long RealAnswer = DecimalToBin(answer);
//         String c=Long.toString(RealAnswer);
//         return c;
        
//     }
// }
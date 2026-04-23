// class Solution {
//     public boolean checkValidString(String s) {  //TC = 3^n and SC = depth of recursion tree ie== O(n);
//         return check(s, 0,0);
//     }
//     public boolean check(String s, int i, int count){  //faile when n== 60 so number of calls become 3^60 which is huge
//         if(count<0)return false;
//         if(i== s.length())return (count==0);

//         if(s.charAt(i) == '(') return check(s, i+1,count+1);
//         if(s.charAt(i) == ')') return check(s, i+1,count-1);
//         return check(s,i+1,count+1) || check(s,i+1, count-1) || check(s,i+1, count); 
//     }
// }

///TRY IT ALSO WITH DP IN o(NsQUARE)

///beLOW SOLTION IN o(N)

class Solution {
    public boolean checkValidString(String s) {  //TC = 3^n and SC = depth of recursion tree ie== O(n);
        int min =0;
        int max =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                min = min+1;
                max= max+1;
            }
            else if(ch == ')'){
                min = min -1;
                max = max-1;
            }
            else{    ///there is an Asterik;
                min = min -1;
                max = max+1;
            }
            if(min <0)min =0;
            if(max < 0)return false;
        }
        return (min ==0);
    }
    
}
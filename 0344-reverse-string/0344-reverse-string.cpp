class Solution {
public:
    void reverseString(vector<char>& s) {
        // int n=s.size();
        // int st=0,end=n-1;
        // while(st<end){
        //     char temp=s[st];
        //     s[st]=s[end];
        //     s[end]=temp;
        // }
        reverse(s.begin(),s.end());
        
    }
};
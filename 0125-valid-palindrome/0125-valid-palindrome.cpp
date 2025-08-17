class Solution {
public:
    bool alphaNum(char a){
        if((a>='a' && a<='z') || (a>='0' && a<='9')){
            return true;
        }
        return false;
    }

    bool isPalindrome(string s) {
        int n=s.size();
        for(int i=0;i<n;i++){
            s[i]=(char)tolower((unsigned char)s[i]);
        }
        int i=0;int j=n-1;
        while(i<j){
            if(!alphaNum(s[i])){
                i++;
                continue;
                }
            else if(!alphaNum(s[j])){
                j--;
                continue;
                }
            if(s[i++]!=s[j--]){return false;}
        }
        return true;
        
    }
};
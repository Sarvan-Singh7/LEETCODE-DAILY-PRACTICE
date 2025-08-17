class Solution {
public:
    bool checkVowel(int i,string s){
        char a=s[i];
        if(a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u'|| a=='A'|| a=='E'|| a=='I'|| a=='O'|| a=='U'){
            return true;
        }
        return false;
    }
    string reverseVowels(string s) {
        int n=s.size();
        int i=0;
        int j=n-1;
        while(i<j){
            if(checkVowel(i,s) && checkVowel(j,s)){
                swap(s[i++],s[j--]);
            }
            else if(checkVowel(i,s)){
                j--;
            }
            else if(checkVowel(j,s)){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return s;
        
    }
};
class Solution {
public:
    string truncateSentence(string s, int k) {
        int count = 0;
        int n = s.size();
        string str;
        for (int i = 0; i < n; i++) {
            if (count < k) {
               if(s[i]==' '){
                    count++;
                    if(count==k){
                        break;
                    }
                }
                str += s[i];
                
            }
        }

        return str;
    }
};
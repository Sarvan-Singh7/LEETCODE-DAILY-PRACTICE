class Solution {
public:
    vector<int> findWordsContaining(vector<string>& words, char x) {
        vector<int> answer;
        int n=words.size();
        for(int i=0;i<n;i++){
            string a=words[i];
            int m=a.size();
            for(int j=0;j<m;j++){
                if(a[j]==x){
                    answer.push_back(i);
                    break;
                }
            }
        }
        return answer;
    }
};
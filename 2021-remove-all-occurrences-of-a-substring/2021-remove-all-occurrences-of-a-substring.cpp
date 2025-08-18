class Solution {
public:
    string removeOccurrences(string s, string part) {
        int n=s.size();
        int m=part.size();
        int a=-1;
        for(int i=0;i<n;i++){
         if(s.find(part)<n){
             a=s.find(part);
             s.erase(a,m);
         }
         
        }
        return s;
    }
};
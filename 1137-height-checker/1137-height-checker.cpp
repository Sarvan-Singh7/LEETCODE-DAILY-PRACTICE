class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int n=heights.size();
        vector<int> expected;
        expected=heights;
        sort(expected.begin(),expected.end());
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
};
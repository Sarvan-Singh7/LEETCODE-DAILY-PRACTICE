class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& arr) {
        int n=arr.size();
        vector<int> answer(n,1);
        int j=0,k=1;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0 ){
                answer[j] = arr[i];
                j+=2;
            }
            else {
                answer[k] = arr[i];
                k+=2;
            }
        }
        return answer;
    }
};
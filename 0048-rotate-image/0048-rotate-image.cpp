class Solution {
public:
    void rotate(vector<vector<int>>& arr) {
        int n=arr.size();
      for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    
    for(int i=0;i<n;i++){
        for(int j=0,k=n-1;j<k;j++,k--){
            int temp=arr[i][j];
            arr[i][j]=arr[i][k];
            arr[i][k]=temp;
        }
    }
    }
};
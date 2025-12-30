class Solution {
public:

    void reverseArray(vector<int> &arr,int st,int end){  //function for reverse
            int i=st,j=end;
            while(i<=j){
                int temp =arr[i];
                arr[i] =arr[j];
                arr[j] =temp;
                i++;
                j--;
            }
        }
    void nextPermutation(vector<int>& arr) {

        

        int n= arr.size(),pivot=-1;
        for(int i=n-2;i>=0;i--){    //finding pivot
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){                //pivot not find when there is decreasing order full array
            reverseArray(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--){    //swap with right most greater than pivot element
            if(arr[pivot] <arr[i]){
                swap(arr[i],arr[pivot]);
                break;                        //break neccessary in all
            } 
        }
        reverseArray(arr,pivot+1,n-1);       //in last reverse  
    }
};       //in last Upvote if Usefull.
class Solution {
public:
    int findClosest(int x, int y, int z) {
        int person1=0;
        int person2=0;
        person1=(z>x) ? z-x : x-z;
        person2=(z>y) ? z-y : y-z;

        if(person1>person2){
            return 2;
        }
        else if(person2>person1){
            return 1;
        }
        else return 0;
    }
};
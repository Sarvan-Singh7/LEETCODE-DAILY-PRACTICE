// class Solution {
//     public int totalFruit(int[] fruits) {
        
//         int maxLength =0;
//         for(int i=0;i<fruits.length;i++){
//             HashSet<Integer> map = new HashSet<>();
//             int count=0;
//             for(int j=i;j<fruits.length;j++){
//                 map.add(fruits[j]);
//                 if(map.size() <=2){
//                     maxLength = Math.max(maxLength, j-i+1);
//                 }
//                 else{
//                     break;   // BREAK JARUR LAGAO AS U CAN STOP WHEN NOT NEEDED
//                 }
                
//             }
//         }
//         return maxLength;
        
        
//     }
// }

///IN A SLIDING WINDOW (left) IS ALWAYS USED TO SHRINK THE WINDOW SO THAT TO CALCULATE NEW SUBSTRING
class Solution {
    public int totalFruit(int[] fruits) {
        int maxLength =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left =0;
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0) +1);
            if(map.size() <=2){
                maxLength= Math.max(maxLength, right - left +1);
            }else{
                if(map.size()>2){
                    
                    map.put(fruits[left], map.get(fruits[left]) -1);
                    if(map.get(fruits[left]) ==0){
                        map.remove(fruits[left]);
                    }
                    left++;
                }
            }
        }
        return maxLength;
    }
}




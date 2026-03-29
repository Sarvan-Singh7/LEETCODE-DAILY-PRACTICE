class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char odd1[] = {s1.charAt(1),s1.charAt(3)};
        char even1[] = {s1.charAt(0),s1.charAt(2)};
        char odd2[] = {s2.charAt(1),s2.charAt(3)};
        char even2[] = {s2.charAt(0), s2.charAt(2)};
        Arrays.sort(odd1); Arrays.sort(odd2); Arrays.sort(even1); Arrays.sort(even2);
        return Arrays.equals(odd1, odd2) && Arrays.equals(even1, even2);
}
}

// class Solution {   === NOT WORKING
//     public boolean canBeEqual(String s1, String s2) {
//         if(s1.equals(s2))return true;
//         int i=0,j=2;
//         char arr[] = s1.toCharArray();
//         while(j<4){
//              char temp = arr[i];
//              arr[i] = arr[j];
//              arr[j] = temp;
//              i++;
//              j++;
//         }
//         s1 = new String(arr);
//         return s1.equals(s2);
//     }
// }
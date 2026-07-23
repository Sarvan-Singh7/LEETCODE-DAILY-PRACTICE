class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        for(int i=0; i<magazine.length(); i++){
            arr[magazine.charAt(i) - 'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(arr[ch - 'a'] != 0){
                arr[ch - 'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
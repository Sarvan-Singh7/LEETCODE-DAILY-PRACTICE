class Solution {
    // In Java, use 'boolean' instead of 'bool'
    public boolean isVowel(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
               a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
    }

    public String reverseVowels(String s) {
        // Convert to char array because Java Strings are immutable
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                // Manual swap logic
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } 
            else if (isVowel(chars[i])) {
                j--;
            } 
            else if (isVowel(chars[j])) {
                i++;
            } 
            else {
                i++;
                j--;
            }
        }
        // Convert the modified array back into a String
        return new String(chars);
    }
}

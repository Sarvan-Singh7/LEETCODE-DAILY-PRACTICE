class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();  //O(1) SC as Map values are minimal
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int answer=0;
        int i=0;
        for(i=0;i<s.length() -1;i++){  //O(N) tc
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(map.get(ch) < map.get(ch2)){   //agar agla Character ka value Bada hai so just do   minus karke dalo and i++ so that agar "IX" input hai toh simple 9 hi calculate ho , na ki 9 + 10;
                answer += map.get(ch2)-map.get(ch);
                i++;
                
            }
            else{
                answer += map.get(ch);
            }
        }
        if(i == s.length() -1) answer += map.get(s.charAt(i));
        return answer;
    }
}
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int answer=0;
        int i=0;
        for(i=0;i<s.length() -1;i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(map.get(ch) < map.get(ch2)){
                answer += map.get(ch2)-map.get(ch);
                i++;
                continue;
            }
            else{
                answer += map.get(ch);
            }
        }
        if(i == s.length() -1) answer += map.get(s.charAt(i));
        return answer;
    }
}
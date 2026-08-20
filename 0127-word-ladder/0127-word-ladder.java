class Pair{
    String word;
    int transform;
    Pair(String word, int transform){
        this.word = word;
        this.transform = transform;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n;i++){
            set.add(wordList.get(i));
        }
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        set.remove(beginWord);///add first word and remove from set to never take it again into consideration
        while(!q.isEmpty()){
            Pair p = q.poll();
            String word = p.word;
            int transform = p.transform;
            char arr[] = word.toCharArray();
            if(word.equals(endWord))return transform;
            for(int i=0; i< arr.length;i++){
                char original = arr[i];
                for(char ch = 'a'; ch <='z';ch++){
                    arr[i] = ch;
                    String check = new String(arr);
                    
                    if(set.contains(check)){
                        set.remove(check);
                        q.add(new Pair(check, transform+1));
                        
                    }
                }
                arr[i] = original;
            }
        }
        return 0;
    }
}
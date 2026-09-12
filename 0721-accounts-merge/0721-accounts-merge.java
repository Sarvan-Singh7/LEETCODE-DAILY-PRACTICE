class Solution {
    static int parent[];
    static int rank[];
    public static int findParent(int i){
        if(i == parent[i])return i;
        return parent[i] = findParent(parent[i]);
    }
    public static void union(int u, int v){
        int rootI = findParent(u);
        int rootJ = findParent(v);
        if(rootI < rootJ){
            parent[rootI] = rootJ;
        }
        else if(rootI > rootJ){
            parent[rootJ] = rootI;
        }
        else{
            parent[rootJ] = rootI;
            rank[rootI]++;
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        parent = new int[n];
        rank = new int[n];
        for(int i=0; i<n;i++)parent[i] =i;
        ///STEP1 => STORING ALL MAILS ACCORDING TO THEIR INDEXES AND ALSO DID UNION ACCORDING TO INDEX USING DSU IF ANY REPEATED SAME MAIL APPEARS AGAIN
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            for(int j=1; j<accounts.get(i).size();j++){//starting from index 1 as 0th is for name(not mail)
                String mail = accounts.get(i).get(j);
                if(!map.containsKey(mail)){
                    map.put(mail, i); //ith index stored (not j)
                }
                else{
                    union(map.get(mail), i);//i , not j
                }
            }
        }

        ///STEP 2 => as now make a new ArrayList of String ArrayList to only store Mails according to ultimate parent indexes
        ArrayList<ArrayList<String>> mergeMail = new ArrayList<>();
        for(int i=0; i<n;i++)mergeMail.add(new ArrayList<>());
        for(String mail : map.keySet()){
            int i = map.get(mail);
            int ultimateParentIndex = findParent(i);
            mergeMail.get(ultimateParentIndex).add(mail);///stored in ultimateParentIndex;
        }
        ///STEP3 = ALSO SORT THE NEW sMALL lIST AND ALSO STORE IT WITH THE NAME AND SKIP EMPTY ONES LIST AS SOME EMPTY NOW

        List<List<String>> result = new ArrayList<>();
        
        for(int i=0; i<n;i++){
            ArrayList<String> mails = mergeMail.get(i);//stored mails array
            if(mails.size() == 0)continue;
            Collections.sort(mails);
            ArrayList<String> temp = new ArrayList<>();//store in sequence first in temp
            temp.add(accounts.get(i).get(0));
            temp.addAll(mails);   ///.addAll method used to copy all elements .IMP
            result.add(new ArrayList<>(temp));
        }
     return result;
    }
}
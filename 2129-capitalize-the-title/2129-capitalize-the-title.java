// class Solution {
//     public String capitalizeTitle(String title) {
//         String words[] = title.split(" ");
//         for(int i=0;i<words.length;i++){
//             String Nword =words[i];
//             if(Nword.length()>0 && Nword.length()>2){
//                 Nword = Nword.substring(0,1).toUpperCase() + Nword.substring(1).toLowerCase();
//             }
//             if(Nword.length()<=2){
//                 Nword =Nword.substring(0).toLowerCase();
//             }
//             words[i] = Nword;
//         }

//         return String.join(" ",words);
//     }
// }


class Solution {
    public String capitalizeTitle(String title) {
        String arr[] = title.split("\\s+");
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            if(word.length() >2 && word.length() >0){
                word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            }
            else if(word.length() <=2){
                word =word.substring(0).toLowerCase();
            }
            arr[i] = word;
        }
        return String.join(" ", arr);
    }
}
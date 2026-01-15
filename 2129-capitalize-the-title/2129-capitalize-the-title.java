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
        String arr[]  = title.split("\\s+");
        for(int i=0;i<arr.length;i++){
            String words = arr[i];   /// pehle ek variable mein daal do ji
            if(words.length()<=2){
                words = words.substring(0).toLowerCase();
            }
            else{
                words=words.substring(0,1).toUpperCase() + words.substring(1).toLowerCase();
            }
            arr[i] = words;    // and phir us hi variable mein bhar do ji
        }
        return String.join(" ",arr);
    }
}





















class Solution {
    public int countCollisions(String s) {
        int i=0;
        int collision =0;
        while(i<s.length() && s.charAt(i) =='L'){      //remove extreme left L if exists as they will never collide as same speed
            i++;
        }
        int j=s.length()-1;
        while(j>=0 && s.charAt(j) == 'R'){    //remove extra right R
            j--;
        }
    
        while(i<=j){         //now simply as new i j will collide so count
            if(s.charAt(i) != 'S'){
                collision++;
            }
            i++;
        }
        return collision;
    }
}
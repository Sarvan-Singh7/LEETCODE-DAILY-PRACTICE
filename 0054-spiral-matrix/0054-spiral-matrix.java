class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
    int row=arr.length;
    int col = arr[0].length;
    int minrow=0,maxrow=row-1,mincol=0,maxcol=col-1;      //ALL FOUR DIMENSIONS TAKEN 


    while(minrow<=maxrow && mincol <= maxcol){            //SIMPLE CONDITION TO BE TRUE

    for(int j=mincol;j<=maxcol;j++){//for left to right(STEP1)
      list.add(arr[minrow][j]);
    }
    minrow++;
    if(minrow>maxrow || mincol>maxcol){break;}///THIS CONDTION IS VERY IMPORTANT TO AVOID OVERLAPPING EXAMPLE 3*5 MATRIX   

    for(int i=minrow;i<=maxrow;i++){//for up to down(STEP2)
      list.add(arr[i][maxcol]);
    }
    maxcol--;
    if(minrow>maxrow || mincol >maxcol){break;}

    for(int j=maxcol;j>=mincol;j--){//for right to left(STEP3)
      list.add(arr[maxrow][j]);
    }
    maxrow--;
    if(minrow>maxrow || mincol >maxcol){break;}

    for(int i=maxrow;i>=minrow;i--){ //for down to up(STEP4)
      list.add(arr[i][mincol]);
    }
    mincol++;
    if(minrow>maxrow || mincol>maxcol){break;
    }
  }
  return list;

    }
}
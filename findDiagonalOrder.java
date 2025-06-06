class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0){
            return new int[0];
        }

        int row=mat.length;
        int col=mat[0].length;

        int i=0;
        int r=0; int c=0;
        boolean up=true;
        int [] a=new int[row*col];
        while(r<row && c<col){
                if(up){

                    while(r>0 && c<col-1){
                        a[i++]=mat[r][c];
                        r--;
                        c++;
                    }
                    a[i++]=mat[r][c];

                    if(c==col-1){
                        r++;
                    }
                    else{
                        c++;
                    }
                }
                else{

                        while(r<row-1 && c>0){
                        a[i++]=mat[r][c];
                        r++;
                        c--;
                    }
                    a[i++]=mat[r][c];

                    if(r==row-1){
                        c++;
                    }
                    else{
                        r++;
                    }
                }

                up=!up;
        }
        return a;
    }
}

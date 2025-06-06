class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;

        int [][]distance=new int[r][c];
        Queue<int[]> cu=new LinkedList();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
            distance[i][j]=0;  
            cu.offer(new int[]{i,j});
        } else {
            distance[i][j]=Integer.MAX_VALUE;  
        }
            }
        }

        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};

        while(!cu.isEmpty()){
            int[] poll=cu.poll();
            int a=poll[0];
            int b=poll[1];

            for(int[] bro:dir){
                    int currrow=a+bro[0];
                    int currcol=b+bro[1];

                    if(currrow>=0 && currrow<r && currcol>=0 && currcol<c){
                            if(distance[currrow][currcol]>distance[a][b]+1){
                                    distance[currrow][currcol]=distance[a][b]+1;
                                    cu.offer(new int[]{currrow, currcol});
                            }
                    }
            }
        }

        return distance;



    }
}

package Two_DArray;

class rows_with_min1s {
    int minRow(int mat[][]) {

        int n=mat.length;
        int m=mat[0].length;

        int mincount=Integer.MAX_VALUE;
        int answer=1;


        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count < mincount){
                mincount=count;
                answer=i+1;
            }
        }
        return answer;


    }
}

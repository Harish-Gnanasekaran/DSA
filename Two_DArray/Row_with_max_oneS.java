package Two_DArray;

public class Row_with_max_oneS {
        public int rowWithMax1s(int[][] arr) {

            int n=arr.length;
            int maxcount=0;
            int index=-1;

            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]==1){
                        count++;
                    }
                }
                if(count>maxcount){
                    maxcount=count;
                    index=i;
                }
            }

            return index;

        }
}

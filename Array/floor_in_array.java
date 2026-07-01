package Array;

class floor_in_array {
    public int findFloor(int[] arr, int x) {

        int current=1;


        for(int i=0;i<arr.length;i++){

            if(arr[0]>x){
                return -1;
            }
            else if(arr[i]<=x){
                current=i;
            }
        }

        return current;




    }
}

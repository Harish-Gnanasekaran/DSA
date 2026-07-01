package Array;

public class peak_element {

        public int peakElement(int[] arr) {
            int n=arr.length;
            if(arr.length==1){
                return 0;
            }

            if(arr[0]>arr[1]){
                return 0;
            }

            for(int i=1;i<arr.length-1;i++){
                if(arr[i]>arr[i-1]){
                    if(arr[i]>arr[i+1]){
                        return i;
                    }
                }
            }

            if(arr[n-1]>arr[n-2]){
                return n-1;
            }

            return -1;

        }
    }


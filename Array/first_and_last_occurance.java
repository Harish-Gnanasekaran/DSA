package Array;


import java.util.ArrayList;

public class first_and_last_occurance {

        ArrayList<Integer> find(int arr[], int x) {


            int [] array = {-1,-1};

            for(int i=0;i<arr.length;i++){

                if(arr[i]==x){
                    array[0]=i;
                    break;

                }

            }

            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]==x){
                    array[1]=i;
                    break;
                }
            }

            ArrayList <Integer>ans=new ArrayList <> ();

            ans.add(array[0]);
            ans.add(array[1]);

            return ans;
        }
    }



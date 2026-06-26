package Recursion;

class one_to_n_without_loop {
    public void printTillN(int n) {

        if(n==0){
            return ;
        }

        printTillN(n-1);
        System.out.print(n + " ");

    }
}

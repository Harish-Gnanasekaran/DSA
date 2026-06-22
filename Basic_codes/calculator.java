package Basic_codes;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int answer=0;

        while(true){
            System.out.println("Enter the operator:");
            char op=input.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*'||op=='/' ||op=='%') {
                System.out.println("Enter two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+') {
                    answer = num1 + num2;
                }
                if (op == '-') {
                    answer = num1 - num2;
                }
                if (op == '*') {
                    answer = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        answer = num1 / num2;
                    }
                }
                if (op == '%') {
                    answer = num1 % num2;
                }
            }
            else if(op=='x'|| op=='X'){
                break;}
            else{
                System.out.println("Invalid operation");}

            System.out.println(answer);

        }
    }

}

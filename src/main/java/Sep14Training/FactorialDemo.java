package Sep14Training;

import java.util.Scanner;

public class FactorialDemo {

    /*
    Factorial of a give number 5
    5! = 5*4*3*2*1
    *
    */

    public static void main(String[] args) {
        int mul=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to find the factorial");
         int num =sc.nextInt();

        for( int i=num ; i>0 ; i--)
        {
            mul = mul*i;
        }
        System.out.println("The factorial of "+num+" : "+mul);
    }
}

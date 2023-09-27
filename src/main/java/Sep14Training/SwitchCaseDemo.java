package Sep14Training;

import java.util.Scanner;

public class SwitchCaseDemo {


    public static void main(String[] args) {
        int a;
        int b;
        String operation;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a");
        a= sc.nextInt();
        System.out.println("Enter b");
        b= sc.nextInt();
        System.out.println("Enter the Arithematic operation to be performed");
        operation= sc.next();
        switch (operation) {
            case "sum":
                int sum = a + b;
                System.out.println("The sum of two numbers : " + sum);
                break;
            case "sub":
                int sub = a - b;
                System.out.println("The sum of two numbers : " + sub);
                break;
            case "multiply":
                int mul = a * b;
                System.out.println("The sum of two numbers : " + mul);
                break;
        }
    }
}

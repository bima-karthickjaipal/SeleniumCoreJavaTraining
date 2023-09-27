package Sep14Training;

import java.util.Scanner;

public class Dowhiledemo {

    public static void main(String[] args) {
        String choice;
        String operation;
        int a=0;
        int b=0;
        do{
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
                    System.out.println("The sub of two numbers : " + sub);
                    break;
                case "multiply":
                    int mul = a * b;
                    System.out.println("The multiply of two numbers : " + mul);
                    break;
            }
            System.out.println("Do you want to continue : Yes/No");
            System.out.println("Enter choice");
            choice= sc.next();
        }while(choice.equalsIgnoreCase("yes"));

    }
}

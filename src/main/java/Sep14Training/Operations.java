package Sep14Training;

import java.util.Scanner;

public class Operations {
    int area;
    long sum;
    double pi= 3.14;

    public int findArea(int radius)
    {
        area = (int) (pi * radius * radius);
        return area;
    }

    public int findArea(int length , int breadth)
    {
        area = length * breadth;
        return area;
    }

    public long sumTwo(int a , long b)
    {
        sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Operations op =new Operations();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input values to find the area of circle");
        System.out.println("Enter radius");
        int r= sc.nextInt();
        System.out.println("The area of circle : "+op.findArea(r));
        System.out.println("Please input values to find the area of Rectangle");
        System.out.println("Enter length");
        int l=sc.nextInt();
        System.out.println("Enter Breadth");
        int b=sc.nextInt();

        System.out.println("The area of rectangle : "+op.findArea(l,b));

        System.out.println("The sum : "+op.sumTwo(104344354,87876765));


    }


}

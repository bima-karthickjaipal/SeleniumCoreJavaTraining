package Sep14Training;

import java.util.Scanner;

public class ControlLoops {

    public void findResult()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks= sc.nextInt();

       /* 0 - 39 : FAIL
        40 - 49 - PASS
        50 - 59 - Second Class
        60-69 - First Class
        above 70 - Distinction.*/


        if(marks<40) { System.out.println("FAIL"); }
        else if(marks >= 40 && marks <50) { System.out.println("PASS"); }
        else if(marks >= 50 && marks <60) { System.out.println("PASS WITH SECOND CLASS"); }
        else if(marks >= 60 && marks <70) { System.out.println("PASS WITH FIRST CLASS"); }
        else if (marks >=70 && marks <=100) { System.out.println("PASS WITH DISTINCTION"); }
    }

    public void findAngle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle (in degree)");
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("Enter the value of c :");
        int c = sc.nextInt();

        /* It terminates the program at point when the condition passes an
        if(a==b && b==c) { System.out.println("Its an Equilateral Triangle"); }
        else if(a==90 && b==90 && c==90) { System.out.println("Its an Right angled Triangle"); }
        else if(a<90 && b<90 && c<90) { System.out.println("Its an Acute Triangle"); }
        else if(a!=b && b!=c && c!=a) { System.out.println("Its a Scalene Triangle"); }
        else if (a>90 || b>90 || c>90) { System.out.println("Its an Obtuse Triangle"); }
        else if ((a==b)&&(a!=c) || (b==c)&&(b!=a)|| (c==a)&&(c!=b)) { System.out.println("Its an Isosceles Triangle"); }
        */

        /* Refined Code  */
        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
            if (a == b && b == c)
                System.out.println("Its an Equilateral Triangle");
            if (a == 90 || b == 90 || c == 90)
                System.out.println("Its an Right angled Triangle");
            if (a < 90 && b < 90 && c < 90)
                System.out.println("Its an Acute Triangle");
                if (a != b && b != c && c != a)
                    System.out.println("Its a Scalene Triangle");
                if (a > 90 || b > 90 || c > 90)
                    System.out.println("Its an Obtuse Triangle");
                if ((a == b&& a != c) || (b == c && b != a) || (c == a && c != b))
                    System.out.println("Its an Isosceles Triangle");
            } else {
                System.out.println("Its not a triangle");
            }

        }



    public static void main(String[] args) {
        ControlLoops cl = new ControlLoops();
        cl.findResult();
        cl.findAngle();

    }
}

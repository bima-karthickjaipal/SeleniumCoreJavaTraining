package Sep14Training;

import java.util.Scanner;

public class ForLoopDemo {

    public static void main(String[] args) {

        /* Number is even or not */

        /*for(int i=1 ; i<=10 ; i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" "+"even");
            }
            else
            {
                System.out.println(i+" "+"odd");
            }
        }*/

        /* Solution 1*/
        for(int i=1 ; i<=30 ; i++)
        {
            if(i%3==0)
            {
                if(i%5 == 0)
                {
                    System.out.println(i + " " + "FizzBuzz");
                }
                else
                    {
                        System.out.println(i + " " + "fizz");
                    }
            }
            else if(i%5==0)
            {
                if(i%3 == 0)
                {
                    System.out.println(i + " " + "FizzBuzz");
                }

                else
                    {
                        System.out.println(i + " " + "Buzz");
                    }
            }
            else
            {
                System.out.println(i);
            }

        }

        /* Solution 2 */
        System.out.println("**********************************");
        for (int i = 1; i <= 30; i++)
            {
                if ((i % 3 == 0 && i % 5 == 0))
                    System.out.println(i + " FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println(i + " Fizz");
                else if (i % 5 == 0)
                    System.out.println(i + " Buzz");
                else
                    System.out.println(i);
            }
    }
}

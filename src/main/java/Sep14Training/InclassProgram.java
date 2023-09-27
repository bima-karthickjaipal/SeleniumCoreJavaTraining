package Sep14Training;

import java.util.Scanner;

public class InclassProgram {

    public static void main(String[] args) {
        /*
          Multiples of any number (tables)
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }


    }
}

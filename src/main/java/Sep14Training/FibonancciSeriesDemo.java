package Sep14Training;

public class FibonancciSeriesDemo {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;
        int n= 10; /* the max position , the series to be printed */
        System.out.print( a +" "+ b+ " ");

        /* Here i is initialised with 3 as it starts from 3rd position where a=0 and b=1 are first two numbers which are already
        initialised and printed in the series
         */
        for(int i=3; i<=n ; i++)
        {
            sum= a+b;
            /* Third number in the series is printed and further computation is performed */
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}

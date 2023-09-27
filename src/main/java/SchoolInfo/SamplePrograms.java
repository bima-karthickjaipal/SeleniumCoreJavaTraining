package SchoolInfo;

import java.util.Locale;

public class SamplePrograms{

    public static void swap(int a, int b) {
        int an = a;
        int bn = b;
        b= an;
        int temp = bn;
        a= temp;

        System.out.println("FirstInt"+ a + "  "+ "SecondInt"+ b);
    }

    public static void main(String[] args) {

        int a[] = {13,45,67,89,34,56,78};

        System.out.println("min : "+ a[0]+ "  "+ "max : "+ a[a.length-1]);


        String s= "Chapter";
        String j = s.concat(" one");
        System.out.println("String1 :"+ s +" "+ "String2 :"+ j );

        StringBuffer sf = new StringBuffer("Hello");
        sf.append("World!!!");
        System.out.println(sf);

        StringBuffer sf1 = new StringBuffer("Hello");
        sf1.insert(1, "Java");
        System.out.println(sf1);

        // System.out.println (sf1.reverse());
       // sf1.delete(1, 3);
        sf1.deleteCharAt(4);
        System.out.println("Deleted at position 4 :"+ sf1);


        for(int i=0; i<sf1.length()-1; i++)
        {
         if(sf1.charAt(i)== 'a')
         {
            sf1.deleteCharAt(i);
         }
        }
        System.out.println("Removing e from the String :"+sf1);

        String Upper = s.replaceAll("([a-z])", "");
        System.out.println("on removing all lower characters :"+Upper);

        String str1 ="     Environ    ment";
        String str2 = str1.toLowerCase(Locale.ROOT);
        String str3 = str1.substring(2,str1.length());
        String str4 = str1.trim();
        String str5= str1.replaceAll("\\s", "");
        System.out.println("The original String : "+ str1+ " "+ "The modified String : "+ str5);

        String arr[]= { "One", "Two" ,"Three"};

        for( String x:  arr)
        {
            System.out.println(x);
        }

        System.out.println("Backward from for loop");
        for(int i=arr.length-1; i>=0; i--)
        {

            System.out.println(arr[i]);
        }

        System.out.println("Forward from for loop");
        for(int i=0; i<=arr.length-1; i++)
        {


            System.out.println(arr[i]);
        }
        System.out.println(arr.length);

        SamplePrograms.swap(12,18);

        int r,sum=0,temp;

        int num=454;
        temp=num;
        while(num!=0)
        {
            r=num%10;
            sum= (sum*10)+r;
            num=num/10;
        }

        if(temp==sum)
        {
            System.out.println("its a palidrome");
        }
        else
        {
            System.out.println("its not a palidrome");
        }

        String original = "COOC";
        String reverse=null;
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        }
        else
        {
            System.out.println("Entered string/number isn't a palindrome.");
    }


}










}

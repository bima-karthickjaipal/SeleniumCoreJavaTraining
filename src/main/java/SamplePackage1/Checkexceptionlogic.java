package SamplePackage1;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.PrintStream;

public class Checkexceptionlogic {

    public static int computeDivision(int a, int b)
    {
        int c=0;
        try {
            c = a / b;

        }catch( NumberFormatException e)
        {
            e.printStackTrace();
        }
        catch( ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("******** Finally block executed ********");
        }
        return c;
    }

    public static int checkForDivision(int a, int b)
    {
        int res=0;
        try{
            res = Checkexceptionlogic.computeDivision(a, b);

        }
        catch( NumberFormatException ex)
        {
            ex.getMessage();
        }
        return res;
    }

    public static void main(String[] args) {
       /* When an Exception is occurred , an Exception object is created and give to JVM
        Creating the Exception Object and handling it in the run-time system is called throwing an Exception
        Later, JVM searches the call stack to find the method which can handle the exception object if tbe appropriate handler method is not found then
        then run time system invokes the default exception handler which will prints the exception information in the following format
        and terminates the program abnormally.
        Exception in thread "main" java.lang.NullPointerException
	    at SamplePackage1.Checkexceptionlogic.main(Checkexceptionlogic.java:8)
        */
        String str=null;
        // System.out.println(str.length());

        try {
            Checkexceptionlogic.checkForDivision(1, 0);
        }catch(NumberFormatException e)
        {
            System.out.println(e.toString());
        }


    }
}

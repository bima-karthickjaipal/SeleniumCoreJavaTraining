package SamplePackage2;

import SamplePackage1.SampleClass1;
import SamplePackage1.SampleClass2;

public class SampleClass3 {
    int a=10;
    double b=15.67;
    boolean c=false;
    void display3()
    {
        System.out.println("MyWorldthree");
    }

    // default Constructor
    SampleClass3 ()
    {
        // initialised during runtime
        a=17;
        b=17.345;
        c=true;
    }

    public static void main(String[] args)
    {
        SampleClass3 sc3= new SampleClass3();
        System.out.println("Int value: "+sc3.a);
        System.out.println("Int value: "+sc3.b);
        System.out.println("Int value: "+sc3.c);
        sc3.display3();

        SampleClass1 sc1 = new SampleClass1();
        System.out.println("Int Value: "+sc1.a);
        // Its a private member of SampleClass1 and can be accessed only within the SampleClass 1
        // System.out.println("Double Value: "+sc1.b);
        // Its a protected member of SampleClass1 and can be accessed only within the SamplePackage1 of different classes
        // System.out.println("Boolean Value: "+sc1.c);
        // Its a protected member of SampleClass1 and can be accessed only within the SamplePackage1 of different classes
        sc1.display();

        System.out.println(sc3.toString());

    }

}

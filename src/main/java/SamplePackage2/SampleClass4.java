package SamplePackage2;

import SamplePackage1.SampleClass1;

public class SampleClass4 extends SampleClass1 {
    int a=10;
    double b=15.67;
    boolean c=false;
    @Override
    public void display()
    {
        System.out.println("MyWorldFour");
    }
    public void display4()
    {
        System.out.println("MyWorldFour");
    }

    // default Constructor
    SampleClass4 ()
    {
        // initialised during runtime
        a=12;
        b=12.345;
        c=true;
    }

    public static void main(String[] args)
    {
        SampleClass4 sc14= new SampleClass4();
        System.out.println("Int value: "+sc14.a);
        /* Its a private member of SampleClass1 and can be accessed only within the SampleClass 1
        It can be accessed in other SamplePackage4 of different class: SampleClass4 by Inheritance.
         */
        System.out.println("double value: "+sc14.b);
        /*Its a protected member of SampleClass1 and can be accessed only within the SamplePackage1 of different classes
        It can be accessed in other SamplePackage4 of different class: SampleClass4 by Inheritance.
        */
        System.out.println("Boolean value: "+sc14.c);
        sc14.display();
        sc14.display();
    }

}

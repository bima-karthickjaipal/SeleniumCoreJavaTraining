package SamplePackage1;

public class SampleClass2 {
    int a=10;
    double b=15.67;
    boolean c=false;
    void display2()
    {
        System.out.println("MyWorldtwo");
    }

    // default Constructor
    SampleClass2 ()
    {
        // initialised during runtime
        a=12;
        b=12.345;
        c=true;
    }

    public static void main(String[] args)
    {
        SampleClass2 sc2= new SampleClass2();
        System.out.println("Int value: "+sc2.a);
        System.out.println("double value: "+sc2.b);
        System.out.println("boolean value: "+sc2.c);
        sc2.display2();

        SampleClass1 sc1 = new SampleClass1();
        System.out.println("Int Value: "+sc1.a);
        // Its a private member of SampleClass1 and can be accessed only within the SampleClass 1
        // System.out.println("Double Value: "+sc1.b);
        // Its a protected member of SampleClass1 and can be accessed only within the SamplePackage1 of different classes
        System.out.println("Boolean Value: "+sc1.c);
        // Its a protected member of SampleClass1 and can be accessed only within the SamplePackage1 of different classes
        sc1.display();

        System.out.println(sc2.toString());

    }

}

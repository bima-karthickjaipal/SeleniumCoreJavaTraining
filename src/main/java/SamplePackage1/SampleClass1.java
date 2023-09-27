package SamplePackage1;

public class SampleClass1 {

    //within the project , any class & any package
    public int a;
    //within the class
    private double b;
    // within the same package, different class
    protected boolean c;
    public void display()
    {
        System.out.println("MyWorld");
    }
    public int add(int a, int b)
    {
        int c = a + b;
        return c;
    }
    public int sub(int a, int b)
    {
        int c= b - a;
        return c;
    }
    public int multiply(int a, int b)
    {
        int c= b * a;
        return c;
    }
    public float divide(int a, int b)
    {
        float c= b / a;
        return c;
    }


    // Default Constructor

    public SampleClass1()
    {
// initialise the default values
    }



    public static void main(String[] args) {

        SampleClass1 sc1 = new SampleClass1();
        System.out.println("Int Value: "+sc1.a);
        System.out.println("Double Value: "+sc1.b);
        System.out.println("Boolean Value: "+sc1.c);
        sc1.display();
        System.out.println (sc1.add(4,4));
        System.out.println (sc1.sub(5,5));
        System.out.println (sc1.multiply(4,5));
        System.out.println (sc1.divide(4,100));

        System.out.println(sc1.toString());

    }

}

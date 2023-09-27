package SamplePackage1;

public class practise {

    int a=10; //global variable
    static long b=40; //global variable

    public float checkNonStatic()
    {
        float c= 89f; //local variable
        return c;
    }

    public static byte checkStatic()
    {
        byte e= 90; //local variable
        return e;
    }

    public long checkMethods() // Non static method access Static members
    {
        return practise.b;
    }

    public int add(int a, int b)
    {
      int c=a/b;
      return c;
    }

    public static void main(String[] args) {
        double d= 12.4; //

        // non-static variable , create instance of the class object and access with reference
        practise p = new practise();
        System.out.println(p.a);
        // local variable of nonstatic method , can be accessed with instance of the object class
        System.out.println(p.checkNonStatic());
        // global static variable, can be accessed without object reference
        System.out.println(b);
        // local variable
        System.out.println(d);
        // local variable of non static method, can be accessed with className
        System.out.println(practise.checkStatic());
        System.out.println("New :"+ p.checkMethods());
        try {
            int csum = p.add(5, 0);
            System.out.println("the addition : " + csum);
        }catch(Exception e)
        {
           // e.printStackTrace();
            System.out.println(e.toString());
        }
    }

}

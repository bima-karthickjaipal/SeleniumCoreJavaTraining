package SamplePackage1;

import org.testng.reporters.XMLConstants;

import java.lang.reflect.Constructor;

public class Parent {
    // global variable can be non-static and called instance variable
    // can add access modifier and static keyword for a global variable
    // can be not initialised and takes up default values
    public String name; // public instance variable
    public int age; // public instance variable
    static  int sl_no; // global variable can be static
    static Parent parent;

    //Constructor
    // Name same as class name
    //Access modifiers can be specified
    //No return value . can mention return: returns the current class instance.
    // initialise static and non static members of the class

    public Parent()
    {
        super();
        System.out.println("Am a default constructor");
    }

    public Parent(String input_name, int input_age, int input_sl_no)
    {
        super();
        //global variable = local variable
        this.name=input_name;
        this.age=input_age;
        this.sl_no=input_sl_no;
        return;
    }


    static void displayStaticMethod()
    {
        System.out.println();
        System.out.println("Displaying values from displayStaticMethod of Parent class");
        parent.name="HariHaran";
        parent.age=24;
        Parent.sl_no= 12;
        System.out.println("sl_no : "+sl_no+ " name = "+parent.name+" "+" age = "+parent.age+" ");
        System.out.println();
    }

    void displayNonStaticMethod()
    {
        //Accessing Static member into a non-static method
        Parent.displayStaticMethod();
        System.out.println("Displaying Non Static Method of parent class");
    }

    void displayNonStaticMethod(String s)
    {
        Parent parent1 = new Parent();
        parent1.displayNonStaticMethod();
    }

    public static void main(String[] args) {
        //cannot add access modifier and static keyword for a local variable
        //local variable has to be initialised and is always non static
        //local variable cannot be accessed with the instance of the object
        String department= "BANGALORE";
        parent= new Parent("Sudan",34,11);
        System.out.println("Displaying from Constructor arguments");
        System.out.println("sl_no :"+sl_no+ " name = "+parent.name+" "+" age ="+parent.age+" "+" department ="+department );
        Parent.displayStaticMethod();
    }
}

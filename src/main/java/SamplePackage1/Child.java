package SamplePackage1;

public class Child extends Parent{
    static String branch;
    static Child child;


    public Child()
    {
        super();
    }

    public Child(String input_name, int input_age, int input_sl_no, String input_branch) {

        super(input_name, input_age, input_sl_no);
        this.branch=input_branch;
    }

    static void displayStaticMethod()
        {
            System.out.println("Displaying Static Method of Child Class");
            child.displayNonStaticMethod();
        }

        void displayNonStaticMethod()
        {
            System.out.println("sl_no : "+sl_no+ " name = "+parent.name+" "+" age = "+parent.age+" "+"branch = "+Child.branch);
        }

    public static void main(String[] args) {

            //Accessing Parent class from Child class(Sub class)
            parent= new Parent("Sudan",34,11);
            parent.displayNonStaticMethod();

            // Overridden method declaration
            // DownCasting
            parent = new Child("Sudan",34,11,"M.G.Road");
            parent.displayNonStaticMethod();

            child = new Child("Rahul",45,15,"Indira nagar");
            child.displayNonStaticMethod();

            // Displaying respective static method declaration
            Parent.displayStaticMethod();
            Child.displayStaticMethod();

            Parent parent1 = new Parent();
            parent1.displayNonStaticMethod();


            /* Non-static method 'displayNonStaticMethod()' cannot be referenced from a static context
            Child.displayNonStaticMethod(); */

            /* Non-static method 'displayNonStaticMethod()' cannot be referenced from a static context
            Parent.displayNonStaticMethod(); */



    }

}

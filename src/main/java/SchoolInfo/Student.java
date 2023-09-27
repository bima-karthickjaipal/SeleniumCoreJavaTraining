package SchoolInfo;

public class Student {
    int rolNo;
    String name;
    String branch;
    void display()
    {
        System.out.println("This is from #display method");
        System.out.println("rolNo: "+ rolNo);
        System.out.println("Name: "+ name);
        System.out.println("Branch: "+ branch);
    }

    // Constructor with Parameterization and Initialization
    Student(int a)
    {
        rolNo=18979;
        name="Karthick Jaipal";
        branch= "Rajajinagar, Bangalore";
    }

    // main class
    public static void main(String[] args)
    {
        Student s1= new Student(1);
        s1.display();

        Student s2= new Student(2);
        s2.display();


    }
}

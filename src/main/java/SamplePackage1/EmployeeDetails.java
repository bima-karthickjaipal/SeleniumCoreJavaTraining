package SamplePackage1;

import io.cucumber.java.an.E;

public class EmployeeDetails {



    //Instance variables [OR] data members
    int empId;
    String empFname;
    String empLname;

    public EmployeeDetails()
    {
        /* Default constructor*/
    }


    public EmployeeDetails(int empId, String empFname , String empLname)
    {
        /*Parameterised Constructor*/
        this.empId=empId;
        this.empFname=empFname;
        this.empLname=empLname;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFname() {
        return empFname;
    }

    public void setEmpFname(String empFname) {
        this.empFname = empFname;
    }

    public String getEmpLname() {
        return empLname;
    }

    public void setEmpLname(String empLname) {
        this.empLname = empLname;
    }

    @Override
    public String toString() {
        return "EmployeeDetails :   {" +
                "empId=" + empId +
                ", empFname='" + empFname + '\'' +
                ", empLname='" + empLname + '\'' +
                '}';
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        /* Initialize by using method/function */

        EmployeeDetails employeeDetails1 = new EmployeeDetails();
        employeeDetails1.setEmpFname("Arun");
        employeeDetails1.setEmpLname("Desai");
        employeeDetails1.setEmpId(001);
        System.out.println("The Employee Details are :" + "employeeId : "+employeeDetails1.getEmpId()+" "+" employeeFirstName : "+employeeDetails1.getEmpFname()
        + " "+" EmployeeLastName : "+employeeDetails1.getEmpLname());


         /* Initialize by using Constructor */

        EmployeeDetails employeeDetails = new EmployeeDetails(2, "Charlie", "Antony");
        System.out.println("The Employee Details are :" + "employeeId : "+employeeDetails.getEmpId()+" "+" employeeFirstName : "+employeeDetails.getEmpFname()
                + " "+" EmployeeLastName : "+employeeDetails.getEmpLname());

        EmployeeDetails employeeDetails2= (EmployeeDetails)Class.forName("SamplePackage1.EmployeeDetails").newInstance();
        employeeDetails2.setEmpFname("Maanik");
        employeeDetails2.setEmpLname("Baasha");
        employeeDetails2.setEmpId(003);
        System.out.println(employeeDetails2.toString());
    }


}

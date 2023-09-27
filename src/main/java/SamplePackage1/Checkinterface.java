package SamplePackage1;

public interface Checkinterface {

    /* cannot create setters and getters for data members/variabled of Interface */
    int metres= 100;
    String event="Olympics";


    public void run();
    public void chase();

    /* In Interface, methods cannot have declarations
    public void checkNonStaticBehaviour()
    {
        //Static variable can be accessed inside a non static member
        System.out.println("metres"+ checkInterface.metres);
    }*/

    public static void main(String[] args) {


        /* final variables cannot be assigned again
        metres = 500; */
        System.out.println("metres : "+ metres);
        System.out.println("event : "+ event);

        /* Can create instance for an Interface only when the methods are declared
        checkInterface here is abstract in nature and cannot be instantiated

        checkInterface checkInterface = new checkInterface() */
    }


}

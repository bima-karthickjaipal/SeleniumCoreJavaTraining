package SamplePackage1;

public class Vehicle {
    /* Encapsulation
    Declare the variables as private
    Declare the setters and getters to set and get the variable values
     */

    private String vehicle_name;
    private int speed;
    static Vehicle vehicle;
    String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /* Method Overloading
    When different functions in a class have the same name but different signatures, it’s called method overloading.
    A method signature contains the name and method arguments. So, overloaded methods have different arguments.
    The arguments might differ in the type of arguments, number of arguments and occurence of arguments
     */

    public void speed(String vehicle_name , int speed)
    {
        vehicle.setVehicle_name(vehicle_name);
        vehicle.setSpeed(speed);
        System.out.println("The Car details : "+ vehicle.getVehicle_name()+ "   " +vehicle.getSpeed());
    }

    // number of arguments
    public void speed(String vehicle_name , int speed, String model)
    {
        vehicle.setVehicle_name(vehicle_name);
        vehicle.setSpeed(speed);
        vehicle.setModel(model);
        System.out.println("The Car details : "+ vehicle.getVehicle_name()+ "   " +vehicle.getSpeed()+ "  " +vehicle.getModel());

    }

    // Occurence of arguments
    public void speed(String vehicle_name , String model, int speed)
    {
        vehicle.setVehicle_name(vehicle_name);
        vehicle.setSpeed(speed);
        vehicle.setModel(model);
        System.out.println("The Car details : "+ vehicle.getVehicle_name()+ "   " +vehicle.getSpeed()+ "  " +vehicle.getModel());
    }

    public void model(String vehicle_name , String model)
    {
        vehicle.setVehicle_name(vehicle_name);
        vehicle.setModel(model);
        System.out.println("The Car details : "+ vehicle.getVehicle_name()+"  "+ vehicle.getModel());

    }

    public static void main(String[] args) {
        vehicle= new Vehicle();
        vehicle.speed("Maruthi",200);
        vehicle.model("Benz","2006_model");
    }


}

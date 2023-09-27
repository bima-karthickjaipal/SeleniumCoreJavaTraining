package SamplePackage1;

public class Car extends Vehicle{
    public String city;
    static public Car car;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void speed(String vehicle_name, int speed) {
        super.speed(vehicle_name, speed);
        car.setCity("Bangalore");
        System.out.println("Name of city has these speed cars : "+vehicle.getVehicle_name()+ "  "+vehicle.getSpeed()+ "  "+car.getCity());
    }


    public void model(String vehicle_name , String model)
    {
        super.model(vehicle_name , model);
        car.setCity("Mumbai");
        System.out.println("Name of city has these model cars : "+vehicle.getVehicle_name()+ "  "+vehicle.getModel()+ "  "+car.getCity());
    }

    public static void main(String[] args) {
        vehicle= new Car();
        car=new Car();
        vehicle.speed("Maruthi Benz", 12);
        vehicle.model("Audi 007", "2023_latestmodel");

    }




}

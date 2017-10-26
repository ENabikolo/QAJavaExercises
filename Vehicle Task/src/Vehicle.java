public abstract class Vehicle {

    //Constructor
    private int year;
    private String vehicleType;
    private int numberOfSeats;
    private int numberOfWheels;

// if something's not changing, you dont need a setter.

}
    public String getvehicleType() {
        return vehicleType;
    }



    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year; }

    void print() {
        System.out.println("Vehicle Type: " + vehicleType + ", numberOfSeats: " + numberOfSeats + ", numberOfWheels: " + numberOfWheels +)
", Year " + year);

   }

 /*
    public class Car extends Vehicle{
    @override

    }
    public class Boat extends Vehicle{}
    public void doBoatStuff(){
    System.out.println("Doing boat stuff");
    }
*/

}

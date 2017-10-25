public class Vehicle {

    //Constructor
    public Vehicle(){

    }

       private int year;
        public String vehicleType;
        public int numberOfSeats;
        int numberOfWheels;

        public Vehicle (int year, String vehicleType, int numberOfSeats, int numberOfWheels);
        this. vehicleType = vehicleType;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this. year = year;


}
    String getvehicleType() {
        return vehicleType;
    }
    int getNumberOfSeats() {
        return numberOfSeats;
    }
    int getNumberOfWheels() {
        return numberOfWheels;
    }
    int getYear() {
    return year;

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

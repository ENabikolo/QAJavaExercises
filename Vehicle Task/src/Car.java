public class Car extends Vehicle {

    //A car is a vehicle so it inherits all non-private Vehicle properties
    private String Make;
    private int numberOfDoors;
    private boolean isConvertible;
    private boolean isAutomatic;

    //Constructor. Stores nODoors,
    public Car( int numberOfSeats, String Make, int numberOfDoors,  boolean isConvertible,  boolean isAutomatic, int year){
            this.setNumberOfSeats(numberOfSeats);
            this.setYear(year);
            this.setVehicleType("Car");
            this.setNumberOfWheels(4);
            this.Make = Make;
            this.isConvertible = isConvertible;
            this.isAutomatic = isAutomatic;
            this.setPrice(50.99);
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}




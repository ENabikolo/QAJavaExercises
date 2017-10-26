public abstract class Vehicle {

    //Constructor
    private double price;
    private int year;
    private String vehicleType;
    private int numberOfSeats;
    private int numberOfWheels;
    private boolean isFixed;
    private int Id;


    // if something's not changing, you don't need a setter.

    public void fixVehicle() {
        if (!this.isFixed) {
            this.isFixed = true; }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
}

   /* void print() {
        System.out.println("Vehicle Type: " + vehicleType + ", numberOfSeats: " + numberOfSeats + ", numberOfWheels: " + numberOfWheels +)
", Year " + year);

   } */



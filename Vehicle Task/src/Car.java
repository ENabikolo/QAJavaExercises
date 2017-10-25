public class Car extends Vehicle {


    public Car() {
        super();
        //A car is a vehicle so it inherits all non-private Vehicle properties
       public int numberOfSeats = 0;
        String Make;
        int numberOfDoors;
        boolean isConvertible;
        boolean isAutomatic;

        //Constructor. Stores nODoors,
    public Car( int numberOfSeats, String Make, int numberOfDoors,  boolean isConvertible,  boolean isAutomatic){
            this.numberOfSeats = numberOfSeats;
            this.Make = Make;
            this.numberOfDoors = numberOfDoors;
            this.isConvertible = isConvertible;
            this.isAutomatic = isAutomatic;

        }
    }

    Car car = new Car();
    Vehicle vehicle = car;

}

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
    public String getMake() {
        return this.Make;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
    public boolean getisConvertible() {
        return this.isConvertible;
    }
    public boolean isAutomatic() {
        return this.isAutomatic;
    }


    }
}

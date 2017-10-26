public class Motorcycle extends Vehicle {

    boolean isOffroad;
    boolean hasSidecar;

    public Motorcycle(int numberOfSeats, int numberOfWheels, boolean isOffroad, boolean hasSidecar, int year) {
        this.setNumberOfSeats(numberOfSeats);
        this.setYear(year);
        this.setVehicleType("Motorcycle");
        this.setNumberOfWheels(numberOfWheels);
        this.isOffroad = isOffroad;
        this.hasSidecar = hasSidecar;
        this.setPrice(37.99);

    }

    public boolean isOffroad() {
        return isOffroad;
    }

    public void setOffroad(boolean offroad) {
        isOffroad = offroad;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}


    //Motorcycle motorcycle = new Motorcycle();

    //upcast to Vehicle
    //Vehicle vehicle = motorcycle;




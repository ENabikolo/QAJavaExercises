public class Bicycle extends Vehicle {

    //A bicycle is a vehicle so it inherits all non-private Vehicle properties
    //A car is a vehicle so it inherits all non-private Vehicle properties
    private String material;
    private int numberOfWheels;
    private int numberOfRiders;
    private String style;

    //Constructor. Stores nODoors,
    public Bicycle( int numberOfWheels, String material, int numberOfRiders, String style, int numberOfSeats, int year){
        this.setNumberOfSeats(numberOfSeats);
        this.setYear(year);
        this.setVehicleType("Bicycle");
        this.setNumberOfWheels(numberOfWheels);
        this.material = material;
        this.setPrice(12.99);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfRiders() {
        return numberOfRiders;
    }

    public void setNumberOfRiders(int numberOfRiders) {
        this.numberOfRiders = numberOfRiders;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}

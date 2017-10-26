import java.util.ArrayList;

public class Garage {
    private int vehicleId = 0;
    private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

    public Garage() {
    }

    //create a garage with vehicles already.
    public Garage(ArrayList<Vehicle> vehicles) {
        garage.addAll(vehicles);
    }


    public void addVehicle(Vehicle v) {
        garage.add(v);
        v.setId(++vehicleId);

    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void removeVehicle(Vehicle v) {
        garage.remove(v);
    }

    public void fixVehicle(Vehicle v) {v.fixVehicle();
    }

    public void emptyGarage() {
        garage.removeAll(garage);
    }

    public int getSize() {
        return garage.size();
    }


    @Override
    public String toString() {
        return ("Number of Vehicles: " + garage.size());
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bicycle(2, "wood", 2,"Lowrider", 2, 2015 ));
        vehicles.add(new Car(5,"Mercedes", 5,false, true, 2014 ));
        vehicles.add(new Motorcycle(2, 2, true,false, 2000 ));

        Garage gUnit = new Garage(vehicles);
            System.out.print(gUnit);



    }

}







import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GarageTest {
    Garage garage;
    Car c1;
    Bicycle b1;
    Motorcycle m1;

    @Before
    public void setUp() {

        c1 = new Car(4, "Jeep", 5, true, false, 2014);
        b1 = new Bicycle(2, "Lugged Steel", 1, "Chopper", 1, 1999);
        m1 = new Motorcycle(2, 2, true, true, 2015);
        garage = new Garage();

    }
    //Tests are for comparison.
        @Test
        public void addVehicle(){
        garage.addVehicle(c1);
        assertEquals(1, garage.getSize());
        }

        @Test
        public void removeVehicle(){
            garage.removeVehicle(c1);
            assertEquals(garage.getSize(),0);
        }

        @Test
        public void fixVehicle(){
        b1.fixVehicle();
        assertEquals(b1.isFixed(), true);
    }

        @Test
        public void emptyGarage(){
         garage.emptyGarage();
         assertEquals(garage.getSize(), 0);
        }

        @Test
        public void getVehicleId() {
        garage.getVehicleId();
        assertEquals(garage.getSize(), 0);
        }

}
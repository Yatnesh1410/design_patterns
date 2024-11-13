package factoryPattern.vehicles;

import factoryPattern.vehicles.entities.Vehicle;
import factoryPattern.vehicles.services.VehicleFactory;

public class Demo {
    public static void main(String[] args){
        Vehicle truck = VehicleFactory.getVehicle("heavy", 8);
        Vehicle car = VehicleFactory.getVehicle("light", 4);
        Vehicle ship = VehicleFactory.getVehicle("water", 0);
        Vehicle plane = VehicleFactory.getVehicle("air", 2);

        assert truck != null;
        System.out.println("Truck:");
        truck.getSpecifications();
        assert car != null;
        System.out.println("Car:");
        car.getSpecifications();
        assert ship != null;
        System.out.println("Ship:");
        ship.getSpecifications();
        assert plane != null;
        System.out.println("Plane:");
        plane.getSpecifications();
    }
}

package factoryPattern.vehicles.entities;

public class Plane extends Vehicle {
    @Override
    public void createVehicle() {
        tyres = 2;
        type = "air";
    }
}

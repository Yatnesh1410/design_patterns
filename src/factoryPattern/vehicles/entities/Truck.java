package factoryPattern.vehicles.entities;

public class Truck extends Vehicle {
    @Override
    public void createVehicle() {
        tyres = 8;
        type = "heavy";
    }
}

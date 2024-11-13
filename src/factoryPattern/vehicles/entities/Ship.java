package factoryPattern.vehicles.entities;

public class Ship extends Vehicle {
    @Override
    public void createVehicle() {
        tyres = 0;
        type = "water";
    }
}

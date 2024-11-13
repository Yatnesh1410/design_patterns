package factoryPattern.vehicles.entities;

public class Car extends Vehicle{
    @Override
    public void createVehicle() {
        tyres = 4;
        type = "light";
    }
}

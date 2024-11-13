package factoryPattern.vehicles.entities;

public abstract class Vehicle {
    protected Integer tyres;
    protected String type;
    public Vehicle(){
        this.createVehicle();
    }

    public abstract void createVehicle();

    public void getSpecifications(){
        System.out.println("The vehicle is of " + this.type + " type and has " + this.tyres + " tyres.");
    }
}

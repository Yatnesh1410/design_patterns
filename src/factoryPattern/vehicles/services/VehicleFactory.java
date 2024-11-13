package factoryPattern.vehicles.services;

import factoryPattern.vehicles.entities.*;

public class VehicleFactory {
    public static Vehicle getVehicle(String detail, Integer tyres){
        if(detail == "heavy" && tyres == 8){
            return new Truck();
        }
        else if(detail == "light" && tyres == 4){
            return new Car();
        }
        else if(detail =="air" && tyres == 2){
            return new Plane();
        }
        else if(detail == "water" && tyres == 0){
            return new Ship();
        }
        else{
            return null;
        }
    }
}

package factory.factories;

import factory.vehicles.Vehicle;
import factory.vehicles.car.CarLuxury;
import factory.vehicles.motorcycle.MotorcycleLuxury;
import factory.vehicles.truck.TruckLuxury;

import java.util.Locale;

public class LuxuryFactory extends Factory{
    private static Factory instance;

    private LuxuryFactory() {

    }
    public static Factory getInstance() {
        if(instance == null) {
            instance = new LuxuryFactory();
        }
        return instance;
    }
    @Override
    Vehicle retrieveVehicle(String type) {
        switch (type) {
            case "car":
                return new CarLuxury();
            case "truck":
                return new TruckLuxury();
            case "motorcycle":
                return new MotorcycleLuxury();
            default: return null;
        }
    }
}

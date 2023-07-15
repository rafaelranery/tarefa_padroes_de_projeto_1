package factory.factories;

import factory.vehicles.Vehicle;
import factory.vehicles.car.CarEconomic;
import factory.vehicles.motorcycle.MotorcycleEconomic;
import factory.vehicles.truck.TruckEconomic;

public class EconomicFactory extends Factory {
    private static Factory instance;
    private EconomicFactory() {

    }
    public static Factory getInstance() {
        if(instance == null) {
            instance = new EconomicFactory();
        }
        return instance;
    }

    @Override
    Vehicle retrieveVehicle(String type) {
        switch (type) {
            case "car":
                return new CarEconomic();
            case "truck":
                return new TruckEconomic();
            case "motorcycle":
                return new MotorcycleEconomic();
            default: return null;
        }
    }
}

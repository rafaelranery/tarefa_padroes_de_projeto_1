package factory.factories;

import factory.vehicles.Vehicle;

public abstract class Factory {
    public static Factory retrieveFactory(String category) {
        if("L".equals(category)) {
            return LuxuryFactory.getInstance();
        } else if ("E".equals(category)) {
            return EconomicFactory.getInstance();
        }
        return null;
    }
    public Vehicle create(String type) {
        Vehicle v = retrieveVehicle(type);
        v = prepareVehicle(v);
        return v;
    }

    public Vehicle prepareVehicle(Vehicle vehicle) {
        vehicle.clean();
        vehicle.refuel();
        return vehicle;
    }

    abstract Vehicle retrieveVehicle(String type);
}

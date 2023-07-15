package factory.vehicles.truck;

public class TruckEconomic extends Truck {
    public TruckEconomic() {
        super();
        this.model = "Volkswagen e-Delivery 11";
        this.color = "blue";
        this.cargoLimit = 1500d;
        this.numberOfAxis = 1;
        this.accelerateRate = 4d;
        this.fuelType = "diesel";
        this.horsePower = 3500d;
        this.price = 160000d;
        this.speedLimit = 140d;
        this.weight = 11000d;
    }
}

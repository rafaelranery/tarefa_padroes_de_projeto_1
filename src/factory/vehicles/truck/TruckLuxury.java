package factory.vehicles.truck;

public class TruckLuxury extends Truck {
    public TruckLuxury() {
        super();
        this.model = "LoneStar LT Series";
        this.color = "red";
        this.cargoLimit = 2050d;
        this.numberOfAxis = 2;
        this.accelerateRate = 6d;
        this.fuelType = "diesel";
        this.horsePower = 6000d;
        this.price = 200000d;
        this.speedLimit = 140d;
        this.weight = 14000d;
    }
}

package factory.vehicles.car;

public class CarLuxury extends Car{
    public CarLuxury() {
       super();
       this.model = "Tesla Model S";
       this.color = "black";
       this.fuelType = "eletricity";
       this.accelerateRate = 19d;
       this.horsePower = 1020d;
       this.weight = 3000d;
       this.price = 120000d;
       this.isAirConditioning = true;
       this.isAutomatic = true;
       this.isHydraulicSteering = true;
       this.trunkSpace = 4.5d;
       this.speedLimit = 300d;
    }
}

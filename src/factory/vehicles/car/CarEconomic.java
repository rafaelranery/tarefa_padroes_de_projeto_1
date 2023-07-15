package factory.vehicles.car;

public class CarEconomic extends Car{
    public CarEconomic() {
       super();
       this.model = "Renault Kwid";
       this.color = "white";
       this.fuelType = "gasoline";
       this.accelerateRate = 9d;
       this.horsePower = 700d;
       this.weight = 6000d;
       this.price = 60000d;
       this.isAirConditioning = true;
       this.isAutomatic = false;
       this.isHydraulicSteering = false;
       this.trunkSpace = 4d;
       this.speedLimit = 170d;
    }
}

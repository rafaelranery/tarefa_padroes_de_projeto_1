package factory.vehicles.motorcycle;

public class MotorcycleEconomic extends Motorcycle{

    public MotorcycleEconomic() {
        super();
        this.model = "Honda CRF";
        this.color = "red";
        this.accelerateRate = 5d;
        this.fuelType = "gasoline";
        this.horsePower = 250d;
        this.cilinders = 2;
        this.price = 5000d;
        this.speedLimit = 100d;
        this.weight = 130d;
    }
    @Override
    public void wheeling() {
        if (this.currentSpeed > 50d) {
            System.out.println("You started wheeling at " + this.currentSpeed + "m/s and CRASH.\nThis was not a good decision...");
        }
        System.out.println("You start wheeling and it feels radical!");
    }
}

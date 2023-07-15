package factory.vehicles.motorcycle;

public class MotorcycleLuxury extends Motorcycle{

    public MotorcycleLuxury() {
        super();
        this.model = "Ducati Diavel";
        this.color = "black";
        this.accelerateRate = 15d;
        this.fuelType = "gasoline";
        this.horsePower = 950d;
        this.cilinders = 4;
        this.price = 100000d;
        this.speedLimit = 250d;
        this.weight = 200d;
    }
    @Override
    public void wheeling() {
        if (this.currentSpeed > 50d) {
            System.out.println("You started wheeling at " + this.currentSpeed + "m/s and CRASH.\nThis was not a good decision...");
        }
        System.out.println("You start wheeling and it feels radical!");
    }
}

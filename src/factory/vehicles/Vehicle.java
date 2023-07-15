package factory.vehicles;

public abstract class Vehicle implements IVehicle {
    protected Double weight;
    protected String color;
    protected Double price;
    protected String model;
    protected String fuelType;
    protected Double accelerateRate;
    protected Double currentSpeed;
    protected Double speedLimit;
    protected String hornSound;
    protected Long mileage;
    protected Double horsePower;
    public Long getMileage() {
        return mileage;
    }

    public String getModel() {
        return model;
    }

    public Double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public final void startEngine() {
        System.out.println(
                "The " + this.model + " has started its engine. You're ready to go!"
        );
    }

    @Override
    public final void move(Integer minutes) {
        Double distanceMoved = this.currentSpeed * Double.valueOf(minutes);
        this.mileage += distanceMoved.longValue();
        System.out.println(
                "The " + this.model + " moved " + distanceMoved + " meters."
        );
    }

    @Override
    public final void accelerate() {
        if(this.currentSpeed < this.speedLimit) {
            this.currentSpeed += this.accelerateRate;
            System.out.println(
                    "You've accelerated, and the " + this.model + " is at a speed of " + this.currentSpeed + "m/s."
            );
        } else {
            System.out.println(
                    "You're at maximum speed!"
            );
        }
    }

    @Override
    public final void stop() {
        if (this.currentSpeed == 0) {
            System.out.println("You're already stopped.");
        } else {
            while(this.currentSpeed > 0) {
                this.currentSpeed -= 10d;
                System.out.println(
                        "Breaking... Current speed at " + this.currentSpeed
                );
            }
            System.out.println("You stopped");
        }
    }

    @Override
    public final void horn() {
        System.out.println(this.hornSound);
    }

    @Override
    public final void clean() {
        System.out.println(
                "The " + this.model + " has been clean."
        );
    }

    @Override
    public final void refuel() {
        System.out.println("Refueling the " + this.model + " with " + this.fuelType + ".\nDone! You're ready to go!");
    }

    @Override
    public String toString() {
        return "Vehicle:\n" +
                "Model: " + model+ '\n' +
                "Color: " + color + '\n' +
                "Price: " + price   ;
    }
}

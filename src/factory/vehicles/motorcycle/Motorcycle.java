package factory.vehicles.motorcycle;

import factory.vehicles.Vehicle;

public abstract class Motorcycle extends Vehicle {
    public Motorcycle() {
        this.hornSound = "Beeeeeeep!";
    }
    protected Integer cilinders;
    public abstract void wheeling();

}

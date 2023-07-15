package factory.vehicles.car;

import factory.vehicles.Vehicle;

public abstract class Car extends Vehicle {

    protected Boolean isAirConditioning;
    protected Boolean isHydraulicSteering;
    protected Boolean isAutomatic;
    protected Double trunkSpace;

    public Car() {
        this.hornSound = "Beep! Beep!";
    }
}

package factory.vehicles.truck;

import factory.vehicles.Vehicle;

public abstract class Truck extends Vehicle {
    public Truck () {
        this.hornSound = "Hoonk! Hoonk!";
    }
    protected Double cargoLimit;
    private Double cargoWeight;
    protected Integer numberOfAxis;
    public final void loadCargo(Double cargoKg) {
        if(cargoKg > this.cargoLimit) {
            System.out.println(
                    "The desired cargo exceeds the " + this.model + " cargo limit.\nUnable to load truck."
            );
        } else if (cargoKg == 0d) {
            System.out.println(
                    "We can't load nothing into the truck..."
            );
        } else {
            this.cargoWeight += cargoKg;
            this.cargoLimit -= cargoKg;
            System.out.println(
                    "The " + this.model + " was successfully loaded. There is space left for " + this.cargoLimit
            );
        }
    }
    public final Double unloadCargo(Double cargoKg) {
        if(cargoKg > this.cargoWeight) {
            System.out.println("The expected unload content weights more than the actual cargo. Are you sure the values are correct?");
            return null;
        } else if (cargoKg == 0d) {
            System.out.println(
                    "We cannot unload 'nothing' from the truck. Are you sure the values are correct?"
            );
            return null;
        } else {
            this.cargoWeight -= cargoKg;
            this.cargoLimit += cargoKg;
            System.out.println(
                    "We successfully unloaded " + cargoKg + " from the " + this.model + ". There's available space for " + this.cargoLimit + "kg."
            );
            return cargoKg;
        }
    }
}

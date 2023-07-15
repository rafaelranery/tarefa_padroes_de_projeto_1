package factory.vehicles;

public interface IVehicle {
    void startEngine();
    void move(Integer minutes);
    void accelerate();
    void stop();
    void horn();
    void clean();
    void refuel();

    String toString();
}

package bridge;

public interface CoolingSystem {
    void turnOn();
    void setFanSpeed(int speedPercentage);
    void coolComponent(String componentName, int targetTemperature);
    void turnOff();
}
package bridge;

public class AirCoolingSystem implements CoolingSystem {
    private final String modelName;

    public AirCoolingSystem(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void turnOn() {
        System.out.println("[Air Cooling - " + modelName + "]: Fans started.");
    }

    @Override
    public void setFanSpeed(int speedPercentage) {
        System.out.println("[Air Cooling - " + modelName + "]: Fan speed set to " + speedPercentage + "%.");
    }

    @Override
    public void coolComponent(String componentName, int targetTemperature) {
        System.out.println("[Air Cooling - " + modelName + "]: Cooling " + componentName + " to " + targetTemperature + "°C.");
    }

    @Override
    public void turnOff() {
        System.out.println("[Air Cooling - " + modelName + "]: Fans stopped.");
    }
}
package bridge;

public class LiquidCoolingSystem implements CoolingSystem {
    private final String modelName;

    public LiquidCoolingSystem(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void turnOn() {
        System.out.println("[Liquid Cooling - " + modelName + "]: Pump started and coolant circulating.");
    }

    @Override
    public void setFanSpeed(int speedPercentage) {
        System.out.println("[Liquid Cooling - " + modelName + "]: Pump and radiator fan speed set to " + speedPercentage + "%.");
    }

    @Override
    public void coolComponent(String componentName, int targetTemperature) {
        System.out.println("[Liquid Cooling - " + modelName + "]: Dissipating heat from " + componentName + " to " + targetTemperature + "°C.");
    }

    @Override
    public void turnOff() {
        System.out.println("[Liquid Cooling - " + modelName + "]: Pump and fans stopped.");
    }
}
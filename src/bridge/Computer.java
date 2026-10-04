package bridge;

public abstract class Computer {
    protected CoolingSystem coolingSystem;
    protected String modelName;

    public Computer(String modelName, CoolingSystem coolingSystem) {
        this.modelName = modelName;
        this.coolingSystem = coolingSystem;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        System.out.println("\n[Changing cooling system for " + modelName + "]");
        this.coolingSystem = coolingSystem;
    }

    public abstract void startWork();
    public abstract void executeHeavyTask();
    public abstract void shutdown();
}
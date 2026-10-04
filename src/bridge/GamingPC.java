package bridge;

public class GamingPC extends Computer {

    public GamingPC(String modelName, CoolingSystem coolingSystem) {
        super(modelName, coolingSystem);
    }

    @Override
    public void startWork() {
        System.out.println("=== Starting Gaming PC: " + modelName + " ===");
        coolingSystem.turnOn();
        coolingSystem.setFanSpeed(40);
    }

    @Override
    public void executeHeavyTask() {
        System.out.println("\n--> Running heavy 4K Ultra gaming workload");
        coolingSystem.setFanSpeed(90);
        coolingSystem.coolComponent("Graphics Card (GPU)", 65);
        coolingSystem.coolComponent("Processor (CPU)", 70);
    }

    @Override
    public void shutdown() {
        System.out.println("\nShutting down Gaming PC " + modelName + "...");
        coolingSystem.setFanSpeed(20);
        coolingSystem.turnOff();
        System.out.println("=== Gaming PC powered off ===\n");
    }
}
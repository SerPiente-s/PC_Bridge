package bridge;

public class WorkstationPC extends Computer {

    public WorkstationPC(String modelName, CoolingSystem coolingSystem) {
        super(modelName, coolingSystem);
    }

    @Override
    public void startWork() {
        System.out.println("=== Starting Workstation PC: " + modelName + " ===");
        coolingSystem.turnOn();
        coolingSystem.setFanSpeed(30);
    }

    @Override
    public void executeHeavyTask() {
        System.out.println("\n--> Running 3D rendering / AI training workload");
        coolingSystem.setFanSpeed(100);
        coolingSystem.coolComponent("Multi-core CPU", 75);
        coolingSystem.coolComponent("RAM and SSD Array", 50);
    }

    @Override
    public void shutdown() {
        System.out.println("\nShutting down Workstation PC " + modelName + "...");
        coolingSystem.turnOff();
        System.out.println("=== Workstation PC powered off ===\n");
    }
}
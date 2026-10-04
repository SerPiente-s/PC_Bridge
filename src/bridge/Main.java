package bridge;

public class Main {
    public static void main(String[] args) {
        CoolingSystem airCooler = new AirCoolingSystem("Noctua NH-D15");
        CoolingSystem liquidCooler = new LiquidCoolingSystem("NZXT Kraken Z73");

        Computer gamingPC = new GamingPC("CyberPower RTX 4090", airCooler);
        gamingPC.startWork();
        gamingPC.executeHeavyTask();

        gamingPC.setCoolingSystem(liquidCooler);
        gamingPC.executeHeavyTask();
        gamingPC.shutdown();

        Computer workstation = new WorkstationPC("AMD Threadripper Pro", liquidCooler);
        workstation.startWork();
        workstation.executeHeavyTask();
        workstation.shutdown();
    }
}
package SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles;

public class Boat implements  Vehicles{

    public Boat() {
    }

    @Override
    public void start() {
        System.out.println("The boat has start the engine");
    }

    @Override
    public void accelerate() {
        System.out.println("The boat has increased speed in the water");

    }

    @Override
    public void break_() {
        System.out.println("The boat has decreased speed and stopped");

    }
}

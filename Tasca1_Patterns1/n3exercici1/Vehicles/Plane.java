package SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles;

public class Plane implements Vehicles{
    public Plane() {
    }

    @Override
    public void start() {
        System.out.println("The plane has started the engine");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane has increased flying speed");

    }

    @Override
    public void break_() {
        System.out.println("The plane has landed and stopped");

    }
}

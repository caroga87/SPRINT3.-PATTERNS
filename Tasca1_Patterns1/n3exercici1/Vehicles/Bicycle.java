package SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles;

public class Bicycle implements Vehicles{
    public Bicycle() {
    }

    @Override
    public void start() {
        System.out.println("The bicycle has started pedaling");
    }

    @Override
    public void accelerate() {
        System.out.println("The bicycle has accelerated by pedaling faster");

    }

    @Override
    public void break_() {
        System.out.println("The bicycle has stopped by braking");

    }
}

package SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles;

public class Car implements Vehicles{

    public Car() {
    }

    @Override
    public void start() {
        System.out.println("The car has started the engine");
    }
    @Override
    public void accelerate() {
        System.out.println("The car has increased speed");

    }
    @Override
    public void break_() {
        System.out.println("The car has stoped");

    }
}

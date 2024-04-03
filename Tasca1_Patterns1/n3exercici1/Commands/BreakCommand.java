package SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles.Vehicles;

public class BreakCommand implements  Command{

    private Vehicles vehicle;

    public BreakCommand(Vehicles vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.break_();
    }
}

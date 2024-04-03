package SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles.Vehicles;

public class AccelerateCommand implements Command {

    private Vehicles vehicle;

    public AccelerateCommand(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}

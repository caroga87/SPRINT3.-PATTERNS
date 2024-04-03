package SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands.AccelerateCommand;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands.BreakCommand;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands.StartCommand;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles.Bicycle;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles.Boat;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles.Car;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Vehicles.Plane;

public class Parking {
    private Car car;
    private Boat boat;
    private Bicycle bicycle;
    private Plane plane;
    private Invoker invoker;

    public Parking() {
        car = new Car();
        boat = new Boat();
        bicycle = new Bicycle();
        plane = new Plane();
        invoker = new Invoker();
    }

    public void CarCommands () {
    this.invoker.Start(new StartCommand(car));
    this.invoker.Accelerate(new AccelerateCommand(car));
    this.invoker.Break(new BreakCommand(car));
    }

    public void BoatCommands () {
        this.invoker.Start(new StartCommand(boat));
        this.invoker.Accelerate(new AccelerateCommand(boat));
        this.invoker.Break(new BreakCommand(boat));
    }
    public void BicycleCommands () {
        this.invoker.Start(new StartCommand(bicycle));
        this.invoker.Accelerate(new AccelerateCommand(bicycle));
        this.invoker.Break(new BreakCommand(bicycle));
    }
    public void PlaneCommands () {
        this.invoker.Start(new StartCommand(plane));
        this.invoker.Accelerate(new AccelerateCommand(plane));
        this.invoker.Break(new BreakCommand(plane));
    }

    public void LetsExecute () {
        this.invoker.LetsStart();
        this.invoker.LetsAccelerate();
        this.invoker.LetsBreak();
    }
}

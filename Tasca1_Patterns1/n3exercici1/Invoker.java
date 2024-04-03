package SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands.AccelerateCommand;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands.BreakCommand;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands.Command;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n3exercici1.Commands.StartCommand;

public class Invoker {
    private Command startCommand;
    private Command accelerateCommand;
    private Command breakCommand;

    public void Start (StartCommand command) {
        this.startCommand = command;
    }

    public void Accelerate (AccelerateCommand command) {
        this.accelerateCommand= command;
    }

    public void Break (BreakCommand command){
        this.breakCommand=command;
    }

    public void LetsStart (){
        if (startCommand != null) startCommand.execute();
    }
    public void LetsAccelerate () {
        if (accelerateCommand != null) accelerateCommand.execute();
    }

    public void LetsBreak () {
        if (breakCommand != null) breakCommand.execute();
    }
}

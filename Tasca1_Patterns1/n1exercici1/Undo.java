package SPRINT3_PATTERNS.Tasca1_Patterns1.n1exercici1;

import java.util.ArrayList;

public class Undo {
    private static Undo instance;
    private ArrayList<String>listCommand;

    private Undo () {
        listCommand = new ArrayList<String>();

    }
    public static Undo getInstance () {
        if (instance==null) {
            instance =new Undo();
        }
        return instance;
    }

    public void addCommand (String command){
        listCommand.add(command);

    }

    public void removeCommand (String command){
        int index= indexCommand(command);
        listCommand.remove(index);

    }
    public int indexCommand (String command) {
        int i=0;
        int index=-1;
        while (i <listCommand.size() && index==-1) {
            if (listCommand.get(i).equalsIgnoreCase(command)) {
                index=i;
            }
            i++;
        }
        return index;
    }
    public void listCommands (){
        for (String command: listCommand) {
            System.out.println(command);
        }


    }
}

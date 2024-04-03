package SPRINT3_PATTERNS.Tasca1_Patterns1.n1exercici1;

import java.util.Scanner;

public class MainUndo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int optionSelected;

        Undo u = Undo.getInstance();

        do {

            System.out.println("Please select the number of the desired option below");
            System.out.println(" 1. Add new command");
            System.out.println(" 2. Remove command");
            System.out.println(" 3. List the last entered commands");
            System.out.println(" 4. Exit");

            optionSelected = scanner.nextInt();

            switch (optionSelected) {
                case 1:
                    u.addCommand(askCommand("What command do you want to add?"));
                    System.out.println("The command has been added successfully.");
                    break;
                case 2:
                    u.removeCommand(askCommand("What command do you want to remove?"));
                    System.out.println("The command has been removed successfully.");
                    break;
                case 3:
                    System.out.println("List of commands:");
                    u.listCommands();
                    break;
                case 4:
                    System.out.println("Thanks for use 'Undo'");
                    break;
                default:
                    System.out.println("Invalid option. Please, try again");
                    break;

            }
        } while (optionSelected !=4);

    }
    static String askCommand (String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();

    }
}

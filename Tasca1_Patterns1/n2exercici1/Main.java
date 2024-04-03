package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.Abstract_factory;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.German_factory;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.Italian_factory;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.Portugal_factory;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optionSelected;

        Contact_Manager cm = Contact_Manager.getInstance();


        //Abstract_factory fabric =

        do {
            System.out.println("Please select the number of the desired option below");
            System.out.println("1.- Add new contact");
            System.out.println("2.- Remove contact");
            System.out.println("3.- Print contact");
            System.out.println("4.- Print list");
            System.out.println("5.- Exit");

            optionSelected = scanner.nextInt();

            switch (optionSelected){
                case 1:
                    askCountry(cm);
                    break;
                case 2:
                    break;
                case 3:
                    cm.printContact(askString("name"), askString("last_name"));
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option. Please, try again");
                    break;
            }

        } while (optionSelected !=5);


    }

    static void askCountry (Contact_Manager cm){

        Abstract_factory factory;
        switch(askString("Choose one country: Germany, Italy or Portugal")) {
            case "Portugal":
                factory = new Portugal_factory();
                break;
            case "Italy":
                factory= new Italian_factory();
                break;
            case "Germany":
                factory= new German_factory();
                break;
            default:
                System.out.println("Choose a valid option");
                return;
        }
        String street = askString("Name of the street");
        int number = askInt("Number");
        int postal_code = askInt("Postal code");
        String city = askString("City");
        int numberPhone = askInt("Telephone number");
        Address newAddress = factory.createAddress(street, number,postal_code,city);
        Telephone newTelephone = factory.createTelephone(numberPhone);
        cm.addContact(new Contact(askString("Name:"), askString("Last name:"), newAddress, newTelephone));



    }

    /*static void newContact () {
        String name= askString("Name:");
        String last_name= askString("Last name");
        Contact newContact = new Contact(name, last_name, );
    }*/

    static String askString (String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }
    static int askInt (String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextInt();
    }

}

package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.Abstract_factory;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.German_factory;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.Italian_factory;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.Portugal_factory;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Contact_Manager {

    static Scanner input = new Scanner(System.in);
    static List<Contact> contactList = new ArrayList<>();

    public static void principal () {
        int option;
        do {
            try {

                option = menu();
                switch (option) {
                    case 1:
                        createContact();
                        break;
                    case 2:
                        removeContact();
                        break;
                    case 3:
                        printContact();
                        break;
                    case 4:
                        printContactList();
                        break;
                    case 5:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid option. Please, try again");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Invalid input, please enter a valid option.");
                input.next();
                option=0;
            }

        } while (option !=5);


    }


    public static int menu() {
        int optionSelected;

        System.out.println("Please select the number of the desired option below");
        System.out.println("1.- Create new contact");
        System.out.println("2.- Remove contact");
        System.out.println("3.- Print contact");
        System.out.println("4.- Print list");
        System.out.println("5.- Exit");
        optionSelected = input.nextInt();
        return optionSelected;
    }


    public static void createContact() {
        switch (chooseCountry()) {
            case 1:
                addNewContact(new German_factory());
                break;
            case 2:
                addNewContact(new Italian_factory());
                break;
            case 3:
                addNewContact(new Portugal_factory());
                break;
            default:
                System.out.println("Please, choose a correct country");
                return;
        }

    }

    public static void addNewContact(Abstract_factory factory) {
        System.out.println("Please, introduce the required information to create a new contact. ");
        Contact newContact = factory.createContact(askString("Name:"), askString("Last name:"),
                factory.createAddress(askString("Street:"), askInt("Number:"), askInt("Postal code:"), askString("City:")),
                factory.createTelephone(askInt("Telephone number:")));
        contactList.add(newContact);
        System.out.println("The contact has created and added correctly");

    }

    public static Contact searchContact (){
        int contactId = askInt("Insert contact Id: ");
        for(int i =0; i< contactList.size(); i++){
            if (contactList.get(i).getId() == contactId){
                //System.out.println(contactList.get(i));
                return contactList.get(i);
            }
        }
        return null;
    }

    public static void removeContact() {
        Contact contact = searchContact();
        if (contact == null) {
            System.out.println("The contact was not found");

        } else {
            contactList.remove(contact);
            System.out.println("The contact " + contact + " has been removed");
        }

    }

    public static void printContact() {
        Contact contact = searchContact();
        if (contact == null) {
            System.out.println("The contact was not found");

        } else {
            System.out.println(contact);

        }

    }

    public static void printContactList() {

        if (contactList.isEmpty()) {
            System.err.println("The contact list is empty");

        } else {
            System.out.println("This is your contact list:");
            contactList.forEach(System.out::println);
        }
    }

    public static int chooseCountry() {
        return askInt("Introduce the number of the country to create a new contact"
                + " 1.- Germany"
                + " 2.- Italy"
                + " 3.-Portugal");
    }


    static String askString(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }

    static int askInt(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextInt();
    }
}

package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1;

import java.util.ArrayList;

public class Contact_Manager {

    private static Contact_Manager instance;
    private ArrayList <Contact> contactList;

    private Contact_Manager (){
        contactList = new ArrayList<>();

    }

    public static Contact_Manager getInstance(){
        if (instance==null) instance = new Contact_Manager();
        return instance;
    }

    public void addContact (Contact contact ){
        contactList.add(contact);
    }

    public void removeContact (String name, String last_name) {
        for (Contact contact :contactList) {
            if (contact.getName().equalsIgnoreCase(name) && contact.getLast_name().equalsIgnoreCase(last_name)){
                System.out.println(contact);
                System.out.println("Are you sure you want to delete this contact?");
            }
        }

    }

    public void printContact (String name, String last_name) {
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name) && contact.getLast_name().equalsIgnoreCase(last_name)){
                System.out.println(contact.toString());
            }else {
                System.out.println("The contact " +name +last_name + " has not been found");
            }
        }

    }

    public void printList () {
        if (contactList.isEmpty()) {
            System.out.println("The contact list is empty!");
        } else {
            contactList.forEach(System.out::println);

        }
    }
}

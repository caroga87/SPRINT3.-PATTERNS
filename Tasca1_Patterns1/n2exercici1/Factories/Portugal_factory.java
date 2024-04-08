package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Address.Address;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Address.Portugal_Address;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Contact;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Telephone.Telephone;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Telephone.Portugal_Telephone;

public class Portugal_factory implements Abstract_factory {

    @Override
    public Contact createContact(String name, String last_name, Address address, Telephone telephone) {
        return new Contact(name, last_name,address, telephone);
    }
    @Override
    public Address createAddress(String street, int number, int postal_code, String city) {
        return new Portugal_Address (street, number, postal_code,city);
    }
    @Override
    public Telephone createTelephone(int number) {
        return new Portugal_Telephone(number);
    }
}

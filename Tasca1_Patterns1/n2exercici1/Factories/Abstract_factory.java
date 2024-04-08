package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Address.Address;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Contact;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Telephone.Telephone;

public interface Abstract_factory {

    Contact createContact (String name, String last_name, Address address, Telephone telephone);
    Address createAddress(String street, int number, int postal_code, String city);
    Telephone createTelephone(int number);

}


package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Address;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Telephone;

public interface Abstract_factory {

    Address createAddress(String street, int number, int postal_code, String city);
    Telephone createTelephone(int number);

}


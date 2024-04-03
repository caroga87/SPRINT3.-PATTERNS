package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Address;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Portugal_Address;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Portugal_Telephone;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Telephone;

public class Portugal_factory implements Abstract_factory {
    @Override
    public Address createAddress(String street, int number, int postal_code, String city) {
        return new Portugal_Address (street, number, postal_code,city);

    }

    @Override
    public Telephone createTelephone(int number) {
        return new Portugal_Telephone(number);
    }
}

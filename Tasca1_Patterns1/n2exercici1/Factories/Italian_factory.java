package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories;

import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Address;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Factories.Abstract_factory;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Italian_Address;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Italian_Telephone;
import SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Telephone;

public class Italian_factory implements Abstract_factory {
    @Override
    public Address createAddress(String street, int number, int postal_code, String city) {
        return new Italian_Address(street, number, postal_code,city);
    }

    @Override
    public Telephone createTelephone(int number) {
        return new Italian_Telephone(number);
    }
}

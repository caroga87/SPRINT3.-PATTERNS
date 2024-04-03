package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1;

public class Portugal_Address implements Address{
    private String street;
    private int number;
    private int postal_code;
    private String city;
    private static final String COUNTRY ="Portugal";

    public Portugal_Address(String street, int number, int postal_code, String city) {
        this.street = street;
        this.number = number;
        this.postal_code = postal_code;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getAddress() {
        return String.format("%s %s\n%s %s \n%s", street, number, postal_code, city,COUNTRY);
    }
}

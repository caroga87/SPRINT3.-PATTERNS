package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1;


public class Contact {
    private static int nextId = 1;
    private int id;
    private String name;
    private String last_name;
    private Address address;
    private Telephone telephone;

    public Contact(String name, String last_name, Address address, Telephone telephone) {
        id=nextId++;
        this.name = name;
        this.last_name = last_name;
        this.address = address;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Address getAddress() {
        return address;
    }

    public Telephone getPhoneNumber() {
        return telephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAddress1(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(Telephone phoneNumber) {
        this.telephone = phoneNumber;
    }

    @Override
    public String toString() {
        return "Id contact: " +id +"\n"
                +name +" " +last_name +"\n"
                +address.getAddress() +"\n"
                +telephone.getPhoneNumber()
                ;
    }
}

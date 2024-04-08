package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1.Telephone;

public class Italian_Telephone implements Telephone {

    private static final String COUNTRY_CODE= "+ 39";
    private int number;

    public Italian_Telephone(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String getPhoneNumber() {
        return COUNTRY_CODE + " " +number;
    }
}

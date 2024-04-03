package SPRINT3_PATTERNS.Tasca1_Patterns1.n2exercici1;

public class Portugal_Telephone implements Telephone{
    private static final String COUNTRY_CODE= "+ 351";
    private int number;

    public Portugal_Telephone(int number) {
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

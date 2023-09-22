package UseDivision;

public class DomesticDivision extends Division{
    private String state;

    // Constructor requiring arguments
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber); // Sets values from Division class
        this.state = state;
    }

    // Setter and getter methods
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Override the abstract method display() from superclass
    public String display() {
        String displayString = "Division Name: " + getDivisionName()
        + "\nAccount Number: " + getAccountNumber()
        + "\nState: " + getState();
        return displayString;
    }
}

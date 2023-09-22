package UseDivision;

public abstract class Division {
    private String divisionName;
    private int accountNumber;

    // Constructor requiring arguments
    protected Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }
    
    // Setter and getter methods
    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Abstract display() method defined in subclasses
    public abstract String display();
}

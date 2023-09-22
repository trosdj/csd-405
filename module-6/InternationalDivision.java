package UseDivision;

public class InternationalDivision extends Division{
    private String country;
    private String language;

    // Constructor requiring arguments
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);     // Sets values from Division class
        this.country = country;
        this.language = language;
    }

    // Setter and getter methods
    public String getCountry() {
        return country;
    }

    public String getLanguage() {
        return language;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    // Override the abstract method display() from superclass
    public String display() {
        String displayString = "Division Name: " + getDivisionName()
        + "\nAccount Number: " + getAccountNumber()
        + "\nCountry: " + getCountry()
        + "\nLanguage Spoken: " + getLanguage();
        return displayString;
    }
}

// DJ Trost | CSD405 | Assignment 6
// Creates a Division abstract class with 2 subclasses and tests 4 instances

package UseDivision;

public class UseDivision {
    public static void main(String[] args) throws Exception {
        // Two instances of DomesticDivision
        Division vernonDivision = new DomesticDivision("Vernon", 1997, "NY");
        Division orlandoDivision = new DomesticDivision("Orlando", 1971, "FL");
        
        // Two instances of InternationalDivision
        Division tokyoDivision = new InternationalDivision("Tokyo", 1983, "Japan", "Japanese");
        Division parisDivision = new InternationalDivision("Paris", 1992, "France", "French");

        // Displays the division info for each instance
        System.out.println(vernonDivision.display() + "\n");
        System.out.println(orlandoDivision.display() + "\n");
        System.out.println(tokyoDivision.display() + "\n");
        System.out.println(parisDivision.display() + "\n");
    }
}
